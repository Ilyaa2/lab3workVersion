package core;

import utility.Weapon;
public class Stick extends Weapon {
    private String name;
    public Stick(){
        name="Палка";
    }
    public Stick(String name ){
        this.name = name;
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
        Stick var = (Stick) obj;
        return name == var.name || var.name != null && name.equals(var.getName()) ;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
