package run;

import core.*;
import core.locations.*;

public class Story {
    public static void main(String[] args) {
        System.out.println("Начало истории");
        Scoperfield scup = new Scoperfield("Скуп");
        scup.cameTo(new HardGround());
        scup.becomeDistract();
        scup.feelHungry();
        scup.cameTo(new Swamp());
        scup.cameTo(new Prickles());
        scup.cameTo(new SoftGrass());
        scup.cameTo(new Anthill());
        Day.end();
        scup.hallucinated();
        Day.gettingDark();
    }
}
