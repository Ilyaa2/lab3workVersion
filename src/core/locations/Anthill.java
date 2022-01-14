package core.locations;

import utility.*;

public class Anthill extends Location {
    private String name;

    public Anthill(){
        this.name = "Муравейник";
        //joinToTheStory();
    }

    //внутренний класс

    class Ants implements Nameable{
        private String name;
        private Amount amount;
        Ants(){
            name = "Муравьи";
            amount = Amount.NotEnough;
        }

        public Amount getAmount() {
            return amount;
        }

        void bite(Hero hero){
            System.out.println(getName()+" кусают "+hero.getName()+'a');
        }
        void becomesMore(){
            System.out.println("Муравьев все больше");
            amount = Amount.Enough;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }

    //анонимный класс
    @Override
    protected void influenceOnHero(Hero hero) {
        Ants ants = new Ants();
        ants.bite(hero);
        outsideFactorsChangeStatus(hero);

        hero.reaction(
                new IPunch() {
                    @Override
                    public void punch() {
                        System.out.println("Герой бьет врагов с помощью палки");
                    }
                }
        );


        ants.becomesMore();
        hero.setStatus(Status.SCARED);
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
