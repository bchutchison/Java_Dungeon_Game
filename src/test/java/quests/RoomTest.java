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
        enemy = new Enemy("Chris", "Goblin", 100, Weapon.CLUB);
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


}
