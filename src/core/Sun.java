package core;

import MyExceptions.InvalidParameterException;
import utility.Hero;
import utility.Influencing;
import utility.Status;
import utility.FeelingTemperature;

public class Sun {
    public static void sunGoesDown(TemperatureOfEnvironment temperature){
        System.out.println();
        System.out.println("Солнце заходит");
        temperature.feelingTemperatureChanges(FeelingTemperature.CHILLY);
        temperature.temperatureChanges((byte) 10);
    }
    public static void sunDisappear(TemperatureOfEnvironment temperature){
        System.out.println("Солнце ушло за горизонт");
        temperature.feelingTemperatureChanges(FeelingTemperature.COLD);
        temperature.temperatureChanges((byte) -10);
    }




    //внутренний класс
    public static class TemperatureOfEnvironment implements Influencing {
        private static FeelingTemperature feelingTemperature;
        private static byte temperature;

        public TemperatureOfEnvironment(FeelingTemperature Temperature){
            this.feelingTemperature = Temperature;
        }
        public TemperatureOfEnvironment(FeelingTemperature Temperature,byte temperature){
            this.feelingTemperature = Temperature;
            if (temperature>70 || temperature<-90){
                throw new InvalidParameterException("Вы ввели некорректную температуру, такого не бывает");
            }
            this.temperature =temperature;
        }

        public void temperatureChanges(byte temperature){
            this.temperature =temperature;
            if (temperature>70 && temperature<-90){
                throw new InvalidParameterException("Вы ввели некорректную температуру, такого не бывает");
            }
        }

        public void feelingTemperatureChanges(FeelingTemperature Temperature){
            this.feelingTemperature = Temperature;

        }

        public static FeelingTemperature getFeelingTemperature() {
            return feelingTemperature;
        }

        public void checkTheFeelingTemperature(Hero hero) {
            if (TemperatureOfEnvironment.getFeelingTemperature() == feelingTemperature.COLD ||
                    TemperatureOfEnvironment.getFeelingTemperature() == feelingTemperature.FROSTY) {
                outsideFactorsChangeStatus(hero);
            }
        }
        @Override
        public void outsideFactorsChangeStatus(Hero hero) {
            hero.setStatus(Status.FROSEN);
        }
    }

}
