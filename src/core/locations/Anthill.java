package core.locations;

import core.Stick;
import utility.Hero;
import utility.Location;
import utility.Status;

public class Anthill extends Location {
    private String name;

    public Anthill(){
        this.name = "Муравейник";
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
    protected void influenceOnHero(Hero hero) {
        System.out.println("Муравьи кусают "+hero.getName()+'а');
        surroundingsСhangeStatus(hero);
        hero.reaction(new Stick());
        System.out.println("Муравьев все больше");
        hero.setStatus(Status.SCARED);
    }


    @Override
    public void surroundingsСhangeStatus(Hero hero) {
        hero.setStatus(Status.ANGRY);
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
        Anthill var = (Anthill) obj;
        return name == var.name || var.name != null && name.equals(var.getName()) ;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
