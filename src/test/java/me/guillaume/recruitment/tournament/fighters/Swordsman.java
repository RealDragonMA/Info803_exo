package me.guillaume.recruitment.tournament.fighters;

import me.guillaume.recruitment.tournament.weapons.Sword;

public class Swordsman extends Fighter {

    public Swordsman() {
        super(100, new Sword());
    }

    public Swordsman equip(String equipment){
        return this;
    }

}
