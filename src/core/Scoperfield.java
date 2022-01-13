package core;

import utility.*;

public class Scoperfield extends Hero {
    private Status state;
    private String name;

    public Scoperfield() {
        this.state = Status.NORMAL;
        this.name = "Default_Name";
        joinToTheStory();
    }

    public Scoperfield(String name) {
        this.state = Status.NORMAL;
        this.name = name;
        joinToTheStory();
    }

    public Scoperfield(String name, Status state) {
        this.state = state;
        this.name = name;
        joinToTheStory();
    }





    @Override
    public void joinToTheStory(){
        System.out.println(getName()+" подключился к истории");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public Status getState() {
        return state;
    }
    @Override
    public void setStatus(Status state) {
        this.state = state;
        System.out.println(getName()+" "+state.getDescription());
        if (this.state == Status.SCARED){
            System.out.println(getName()+" убегает в страхе");
        }
    }

    @Override
    protected void eat(Food food){
        System.out.println(getName()+" нашел и жует "+food);
        if (food.getTaste()== Taste.EATABLE){
            setStatus(Status.NORMAL);
        }else{
            spit();
        }
    }

    private void searchTheFood() {
        System.out.println(getName()+" ищет еду");
        Food[] food = {Food.BERRIES, Food.MUSHROOMS, Food.NUTS, Food.GRASS};
        for (Food var : food)
            if (var.getFlag())
                eat(var);
    }

    private void spit(){
        System.out.println(getName()+" выплюнул бяку");
    }

    public void feelHungry(){
        setStatus(Status.HUNGRY);
        searchTheFood();
    }

    public void reaction(IPunch var){
        if (getState() == Status.ANGRY){
            var.punch();
        }
    }

    public void becomeDistract(){
        setStatus(Status.DISTRACTED);
    }

    public void hallucinated(){
        setStatus(Status.HALLUCINATED);
    }

    //переопределение методов задания

    @Override
    public int hashCode() {
        int result = 1;
        result = name.hashCode();
        result = 31*result + state.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Scoperfield scup = (Scoperfield) obj;
        return ( name == scup.name || scup.name != null && name.equals(scup.getName()) )
                && (state == scup.state || scup.state != null && state.equals(scup.getState()));
    }

    @Override
    public String toString() {
        return "I am "+ name + " and my state is " + state;
    }
}
