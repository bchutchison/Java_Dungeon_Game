package characters;

import inventory.Inventory;
import items.Treasure;

public abstract class GameCharacter {

    private String name;
    private String type;
    private int health;
    private Inventory inventory;

    public GameCharacter(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.inventory = new Inventory();
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void collectReward(GameCharacter enemy){
        if(enemy.getInventory().getTreasureCount() > 0) {
            Treasure treasure = enemy.getInventory().removeTreasure();
            inventory.getTreasure(treasure);
        }
    }


}

