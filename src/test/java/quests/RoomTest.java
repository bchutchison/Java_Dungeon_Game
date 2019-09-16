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
        room = new Room();
        enemy = new Enemy("Chris", "Goblin", 100, Armour.NONE, Weapon.CLUB);
    }

    @Test
    public void roomHasEnemy() {
        room.setEnemy(enemy);
        assertEquals("Chris", room.getEnemy().getName());
    }

    @Test
    public void roomEnemyHasTreasure() {
        room.setEnemy(enemy);
        assertEquals(1, room.getEnemy().getInventory().getTreasureCount());
    }


}
