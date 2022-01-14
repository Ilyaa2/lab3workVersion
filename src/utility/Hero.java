package utility;

public abstract class Hero implements Fairy, Nameable {

    public void cameTo(Location loc){
        System.out.println();
        System.out.println(getName()+" пришел в локацию "+loc.getName());
        loc.influenceOnHero(this);
    }

    public void cameTo(Location... array){
        for (Location loc : array){
            System.out.println();
            loc.joinToTheStory();
            System.out.println(getName()+" пришел в локацию "+loc.getName());
            loc.influenceOnHero(this);
        }
    }

    public abstract void setStatus(Status state);
    public abstract Status getState();
    public void reaction(IPunch var){
        var.punch();
    }

}

