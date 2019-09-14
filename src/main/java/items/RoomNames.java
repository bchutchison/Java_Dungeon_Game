package items;

import java.util.Random;

public enum RoomNames {

    ROOM1,
    ROOM2,
    ROOM3,
    ROOM4;

    private static final RoomNames[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static Random RANDOM = new Random();

    public static RoomNames getRandomName() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }


}

