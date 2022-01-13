package utility;


public abstract class Location implements Influencing, Fairy, Nameable {

    protected abstract void influenceOnHero(Hero hero);
    @Override
    public void joinToTheStory() {
        System.out.println();
        System.out.println(getName()+" на горизонте");
    }
}
