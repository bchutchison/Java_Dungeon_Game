package quests;

import characters.Enemy;
import items.Armour;
import items.RoomNames;
import items.Weapon;

import java.util.ArrayList;
import java.util.Random;

public class Quest {

    private Enemy enemy;
    private Room room;
    private ArrayList<Room> quests;

    public Quest() {
        this.quests = new ArrayList<Room>();
    }

    public void start(int questLength) {
            questLength += 1;
            for(int i = 1; i < questLength; i++){
                room = new Room();
                int health = 50 * i;
                enemy = new Enemy("Enemy" + i, "Troll", health, Armour.getRandomArmour(), Weapon.getRandomWeapon());
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
}
