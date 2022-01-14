package run;

import core.*;
import core.locations.*;
import utility.FeelingTemperature;

public class Story {
    public static void main(String[] args) {
        System.out.println("Начало истории");
        Scoperfield scup = new Scoperfield("Скуп");
        scup.cameTo(new HardGround());
        scup.becomeDistract();
        scup.feelHungry();
        scup.cameTo(new Swamp(),new Prickles(),new SoftGrass(),new Anthill());
        /*new Anthill будет иметь переменную для создания муравьев
        * */

        Sun.TemperatureOfEnvironment temp = new Sun.TemperatureOfEnvironment(FeelingTemperature.NORMAL,(byte) 50);
        Sun.sunGoesDown(temp);
        temp.checkTheFeelingTemperature(scup);
        scup.hallucinated();
        Sun.sunDisappear(temp);
        temp.checkTheFeelingTemperature(scup);
    }
}

