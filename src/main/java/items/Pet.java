package items;

public enum Pet {

    DOG(3),
    HAMSTER(1),
    DRAGON(4),
    RABBIT(2);

private final int defence;

Pet(int defence) {
    this.defence = defence;
}

    public int getDefence() {
        return defence;
    }
}
