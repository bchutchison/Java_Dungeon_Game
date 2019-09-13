package items;

import java.util.Random;

public enum Armour {

    HELMET(3),
    CUIRASS(4),
    GAUNTLETS(2);

    private final int resistance;

    private static final Armour[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static Random RANDOM = new Random();

    Armour(int resistance) {
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

    public static Armour getRandomArmour() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }


}
