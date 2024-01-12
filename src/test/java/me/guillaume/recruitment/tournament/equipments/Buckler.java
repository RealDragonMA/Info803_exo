package me.guillaume.recruitment.tournament.equipments;

import me.guillaume.recruitment.tournament.fighters.Fighter;
import me.guillaume.recruitment.tournament.weapons.Axe;

public class Buckler extends Equipment {

    private int blocking;
    private int life;

    public Buckler() {
        this.blocking = -1;
        this.life = 3;
    }

    @Override
    public int run(Fighter fighter, Fighter opponent, int damage) {

        this.blocking++;

        // If the buckler is broken, it can't block anymore
        if (this.life == 0) return damage;

        // If the buckler is not broken, it blocks (one time out of two) the damage
        if (this.blocking % 2 == 0) return 0;

        // If the opponent is a Viking and has an axe, the buckler loses one life point
        if(opponent.getWeapon() instanceof Axe) this.life--;

        // Else, we return the damage
        return damage;

    }
}
