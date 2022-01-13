package utility;

public enum Food {
    BERRIES(false, Taste.EATABLE),
    MUSHROOMS(false, Taste.EATABLE),
    GRASS(true, Taste.UNEATABLE),
    NUTS(false, Taste.EATABLE);

    private final boolean FLAG;
    private final Taste TASTE;

    private Food(boolean flag, Taste taste) {
        this.FLAG = flag;
        this.TASTE = taste;
    }

    public boolean getFlag() {
        return this.FLAG;
    }

    public Taste getTaste() {
        return this.TASTE;
    }
}
