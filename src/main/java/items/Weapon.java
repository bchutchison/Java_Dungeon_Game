package items;

import java.util.Random;

public enum Weapon {

    SWORD(20),
    AXE(25),
    CLUB(40);

    private final int damage;

    private static final Weapon[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static Random RANDOM = new Random();

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public static Weapon getRandomWeapon() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    //random weapon generation on creation of enemy
    public void addRandomWeapon() {
    }
}
