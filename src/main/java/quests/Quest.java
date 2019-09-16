package quests;

import behaviours.IAttack;
import characters.Enemy;
import characters.GameCharacter;
import characters.Warrior;
import items.Armour;
import items.RoomData;
import items.Weapon;

import java.util.ArrayList;

public class Quest {

    private RoomData roomData;
    private Enemy enemy;
    private Room room;
    private ArrayList<Room> quests;

    public Quest() {
        this.roomData = roomData;
        this.quests = new ArrayList<Room>();
    }

    public void start(int questLength) {
            questLength += 1;
            for(int i = 1; i < questLength; i++){
                roomData = roomData.getRandomName(); //why does this not work without?
                room = new Room();
                int health = roomData.getHealth() * i;
                enemy = new Enemy(roomData.getName(), roomData.getType(), health, Armour.getRandomArmour(), Weapon.getRandomWeapon());
                room.setEnemy(enemy);
                quests.add(room);
            }
        }

    public int questCount() {
        return quests.size();
    }

    public Room getRoom() {
        return room;
    }

    public ArrayList<Room> getQuests() {
        return quests;
    }

    public Room removeRoomForActivity() {
        return this.quests.remove(0);
    }

    public void attackEnemyInRoom(IAttack character) {
        //call characters attack method on enemy by active character passed in
        Room room = removeRoomForActivity();
        character.attack(room.getEnemy());
}


}
