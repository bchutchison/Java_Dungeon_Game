package quests;

import characters.Enemy;
import items.RoomNames;

public class Room {

    private Enemy enemy;
    private RoomNames roomNames;

    public Room(){
        this.enemy = enemy;
//        this.roomNames = roomNames;
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

}
