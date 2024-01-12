package me.guillaume.recruitment.tournament;

import me.guillaume.recruitment.tournament.fighters.Swordsman;
import me.guillaume.recruitment.tournament.fighters.Viking;

import static org.assertj.core.api.Assertions.assertThat;

public class main {

    public static void main(String[] args) {
        Swordsman swordsman = new Swordsman();

        Viking viking = new Viking();

        swordsman.engage(viking);

    }

}
