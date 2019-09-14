package inventory;

import characters.Enemy;
import characters.Warrior;
import items.Armour;
import items.Treasure;
import org.junit.Before;
import org.junit.Test;

import static items.Weapon.CLUB;
import static items.Weapon.SWORD;
import static org.junit.Assert.assertEquals;

public class InventoryTest {

    Inventory inventory;
    Enemy enemy;
    Warrior warrior;

    @Before
    public void setUp() {
        inventory = new Inventory();
        enemy = new Enemy("Ben", "Troll", 100, Armour.NONE, CLUB);
        warrior = new Warrior("Eve", "Dwarf", 400, Armour.HELMET, SWORD);
    }

    @Test
    public void hasEmptyArray() {
        assertEquals(0, inventory.getTreasureCount());
    }

    @Test
    public void canAddTreasureToInventory() {
        inventory.addTreasureToInventory(Treasure.RUBY);
        assertEquals(1, inventory.getTreasureCount());
    }

    @Test
    public void canGetTotalTreasureValue() {
        inventory.addTreasureToInventory(Treasure.RUBY);
        assertEquals(10, inventory.getTotalTreasureValue());
    }

}
