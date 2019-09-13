package quests;

import characters.Enemy;

import static items.Treasure.getRandomTreasure;


public class Room {

    private Enemy enemy;
    private String name;

    public Room(String name){
        this.name = name;
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public String getName() {
        return name;
    }
}
