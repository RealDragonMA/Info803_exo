package me.guillaume.recruitment.tournament.weapons;

public abstract class Weapon {

    private final int damage;
    private final int hands;

    public Weapon(int damage, int hands) {
        this.damage = damage;
        this.hands = hands;
    }

    public Weapon(int damage) {
        this(damage, 1);
    }

    public int getDamage() {
        return damage;
    }

    public int getHands() {
        return hands;
    }

}
