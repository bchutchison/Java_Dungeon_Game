package quests;

import characters.Enemy;
import characters.Warrior;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestTest {

    Quest quest;
    Room room;
    Enemy enemy;
    Warrior warrior;

    @Before
    public void setUp() {
        quest = new Quest();
        room = new Room();
        warrior = new Warrior("Eve", "Dwarf", 400, Armour.HELMET, Weapon.CLUB);
        enemy = new Enemy("Chris", "Goblin", 100, Armour.NONE, Weapon.CLUB);
    }


    @Test
    public void hasEmptyArrayListOfQuestsBeforeStart() {
        assertEquals(0, quest.questCount());
    }

    @Test
    public void hasArrayListOfQuests() {
        quest.start(4);
        assertEquals(4, quest.questCount());
    }

    @Test
    public void canAttackEnemyInFirstRoom() {
        quest.start( 4);
        assertEquals(4, quest.questCount());
        quest.attackEnemyInRoom(warrior);
        assertNotEquals(150, quest.getQuests().get(0).getEnemy().getHealth());
    }



    @Test
    public void canAccessNextRoomInArrayList() {

    }


}
