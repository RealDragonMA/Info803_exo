package me.guillaume.recruitment.tournament.fighters;

import me.guillaume.recruitment.tournament.equipments.Equipment;
import me.guillaume.recruitment.tournament.weapons.Weapon;

import java.util.ArrayList;

public abstract class Fighter {

    private int life; // hit points
    private final Weapon weapon;
    private ArrayList<Equipment> equipments;

    public Fighter(int life, Weapon weapon) {
        this.weapon = weapon;
        this.life = life;
        this.equipments = new ArrayList<>();
    }

    public void engage(Fighter opponent) {
        while (hitPoints() > 0 && opponent.hitPoints() > 0) {
            playTurn(opponent);
            opponent.playTurn(this);
        }
    }

    private void playTurn(Fighter opponent) {
        int damage = getWeapon().getDamage();
        for (Equipment equipment : opponent.getEquipments()) {
            damage = equipment.run(opponent, this, damage);
        }
        opponent.hit(damage);
    }

    public void hit(int damage) {
        this.life -= damage;
        this.life = Math.max(0, this.life);
    }


    public Weapon getWeapon() { return weapon; }
    public int hitPoints() { return life; }
    public ArrayList<Equipment> getEquipments() { return equipments; }
    public void addEquipment(Equipment equipment) { this.equipments.add(equipment); }

}
