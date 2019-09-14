package characters;

import items.Armour;
import items.Treasure;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WarriorTest {

    Warrior warrior;
    Enemy enemy;
    Enemy enemy2;

    @Before
    public void setUp() {
        warrior = new Warrior("Eve", "Dwarf", 400, Armour.HELMET, Weapon.CLUB);
        enemy = new Enemy("Ben", "Troll", 100, Weapon.CLUB);
        enemy2 = new Enemy("Rich", "Troll", 100, Weapon.CLUB);

    }

    @Test
    public void hasName() {
        assertEquals("Eve", warrior.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Dwarf", warrior.getType());
    }

    @Test
    public void hasHealth() {
        assertEquals(400, warrior.getHealth());
    }

    @Test
    public void hasArmour() {
        assertEquals(Armour.HELMET, warrior.getArmour());
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapon.CLUB, warrior.getWeapon());
    }

    @Test
    public void hasArmourResistance() {
        assertEquals(3, warrior.getArmourResistance());
    }

    @Test
    public void hasWeaponDamage() {
        assertEquals(110, warrior.getWeaponDamage());
    }

    @Test
    public void canDefend() {
        warrior.defend(40);
        assertEquals(387, warrior.getHealth()); // make sure enemy attack goes down
    }

    @Test
    public void canAttack() {
        warrior.attack(enemy);
        assertNotEquals(100, enemy.getHealth()); // make sure warrior health goes down
    }

    @Test
    public void canGetTreasure() {
        warrior.getInventory().addTreasureToInventory(Treasure.RUBY);
        assertEquals(1, warrior.getInventory().getTreasureCount());
    }

    @Test
    public void canCollectReward() {
        enemy.getInventory().addTreasureToInventory(Treasure.RUBY);
        warrior.collectReward(enemy);
        assertEquals(1, warrior.getInventory().getTreasureCount());
    }

//    @Test //generation of treasure is random so cant be tested without error
//    public void canGetTotalTreasureValue() {
//        warrior.collectReward(enemy);
//        assertEquals(10, warrior.getInventory().getTotalTreasureValue());
//    }

    @Test
    public void canCollectRewardsFromMultipleFoes() {
        warrior.collectReward(enemy);
        warrior.collectReward(enemy2);
        assertEquals(2, warrior.getInventory().getTreasureCount());
    }


}
