package items;

import java.util.Random;

public enum RoomData {

    ROOMA("Bob", "Troll", 150),
    ROOMB("Dave", "Slug", 150),
    ROOMC("Sue", "Snail", 150),
    ROOMD("Clair", "Thing", 150);

    private final String name;
    private final String type;
    private final int health;

    RoomData(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }
    public String getName() {
        return this.name;
    }
    public String getType() { return this.type; }
    public int getHealth() { return this.health; }

    private static final RoomData[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static Random RANDOM = new Random();

    public static RoomData getRandomName() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }


}

