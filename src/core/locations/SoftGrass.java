package core.locations;
import utility.Hero;
import utility.Status;
import utility.Location;

public class SoftGrass extends Location {
    private String name;

    public SoftGrass(){
        this.name = "Мягкая трава";
        //joinToTheStory();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void outsideFactorsChangeStatus(Hero hero) {
        hero.setStatus(Status.RESTED);
    }



    @Override
    protected void influenceOnHero(Hero hero) {
        System.out.println(hero.getName()+" сидит и отдыхает на мягкой траве");
        outsideFactorsChangeStatus(hero);
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
        SoftGrass var = (SoftGrass) obj;
        return name == var.name || var.name != null && name.equals(var.getName()) ;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
