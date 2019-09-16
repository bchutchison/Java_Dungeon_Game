package items;

public enum Spell {

    FIREBALL(120),
    LIGHTNING(150),
    WATER(80);

    private final int damage;

    Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
