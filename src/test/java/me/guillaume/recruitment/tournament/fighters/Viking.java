package me.guillaume.recruitment.tournament.fighters;

import me.guillaume.recruitment.tournament.weapons.Axe;

public class Viking extends Fighter {

    public Viking(){
        super(120, new Axe());
    }

    public Viking equip(String equipment){
        return this;
    }

}
