package utility;

public abstract class Weapon implements Nameable, IPunch {
    public void punch(){
        System.out.println("Герой бьет врагов с помощью оружия "+getName());
    }
}
