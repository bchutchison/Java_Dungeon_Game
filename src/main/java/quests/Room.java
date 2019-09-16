package quests;

import behaviours.IAttack;
import characters.Enemy;
import items.RoomData;

public class Room {

    private Enemy enemy;
    private RoomData roomNames;

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

    public void setRoomNames(RoomData roomNames) {
        this.roomNames = roomNames;
    }




}
