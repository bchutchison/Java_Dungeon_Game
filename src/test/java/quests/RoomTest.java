package quests;

import items.Armour;
import characters.Enemy;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Enemy enemy;

    @Before
    public void setUp(){
        room = new Room("Room of Doom");
        enemy = new Enemy("Chris", "Goblin", 100, Armour.NONE, Weapon.CLUB);
    }

    @Test
    public void roomHasName() {
        assertEquals("Room of Doom", room.getName());
    }

    @Test
    public void roomHasEnemy() {
        room.setEnemy(enemy);
        assertEquals("Chris", room.getEnemy().getName());
    }

    @Test
    public void roomEnemeyHasTreasure() {
        room.setEnemy(enemy);
        assertEquals(1, room.getEnemy().getInventory().getTreasureCount());
    }


}
