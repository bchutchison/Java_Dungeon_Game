package quests;

import characters.Enemy;
import items.RoomNames;

public class Room {

    private Enemy enemy;
    private RoomNames roomNames;

    public Room(){
//        this.roomNames = roomNames;
        this.enemy = enemy;
//        addRandomRoomName(roomNames.getRandomName());
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void setRoomNames(RoomNames roomNames) {
        this.roomNames = roomNames;
    }

    public void addRandomRoomName(RoomNames item) {
        setRoomNames(item);
    }
}
