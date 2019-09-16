package characters;

import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Enemy enemy;
    Enemy enemy2;

    @Before
    public void setUp() {
        wizard = new Wizard("Jim", "Wizard", 250, Pet.DOG, Spell.FIREBALL);
        enemy = new Enemy("Ben", "Troll", 100, Armour.NONE, Weapon.CLUB);
        enemy2 = new Enemy("Rich", "Troll", 100, Armour.NONE, Weapon.CLUB);
    }

    @Test
    public void hasName() {
        assertEquals("Jim", wizard.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Wizard", wizard.getType());
    }

    @Test
    public void hasHealth() {
        assertEquals(250, wizard.getHealth());
    }

    @Test
    public void hasPet() {
        assertEquals(Pet.DOG, wizard.getPet());
    }

    @Test
    public void hasSpell() {
        assertEquals(Spell.FIREBALL, wizard.getSpell());
    }

    @Test
    public void canGetTreasure() {
        wizard.getInventory().addTreasureToInventory(Treasure.RUBY);
        assertEquals(1, wizard.getInventory().getTreasureCount());
    }

    @Test
    public void canCollectReward() {
        enemy.getInventory().addTreasureToInventory(Treasure.RUBY);
        wizard.collectReward(enemy);
        assertEquals(1, wizard.getInventory().getTreasureCount());
    }

}
