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
        quest = new Quest(4);
        room = new Room();
        enemy = new Enemy("Chris", "Goblin", 100, Armour.NONE, Weapon.CLUB);
    }


    @Test
    public void hasEmptyArrayListOfQuestsBeforeStart() {
        assertEquals(0, quest.questCount());
    }


    @Test
    public void hasArrayListOfQuests() {

    }

}
