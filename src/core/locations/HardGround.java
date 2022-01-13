package core.locations;

import utility.Hero;
import utility.Location;
import utility.Status;
public class HardGround extends Location {
    private String name;

    public HardGround(){
        this.name = "Твердая земля";
        joinToTheStory();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void surroundingsСhangeStatus(Hero hero) {
        hero.setStatus(Status.NORMAL);
    }



    @Override
    protected void influenceOnHero(Hero hero) {
        System.out.println(hero.getName()+" в безопасности");
        surroundingsСhangeStatus(hero);
    }


    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        HardGround var = (HardGround) obj;
        return name == var.name || var.name != null && name.equals(var.getName()) ;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
