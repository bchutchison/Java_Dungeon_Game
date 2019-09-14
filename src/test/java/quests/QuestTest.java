package quests;

import characters.Enemy;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Quest quest;
    Room room;
    Enemy enemy;

    @Before
    public void setUp() {
        quest = new Quest();
        room = new Room();
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
    public void hasRandomEnemyInEachRoom() {
        quest.start(3);
        assertEquals(3, quest.questCount());
        assertEquals("Enemy1", quest.getQuests().get(0).getEnemy().getName());
    }


}
