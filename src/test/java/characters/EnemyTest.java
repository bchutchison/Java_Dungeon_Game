package characters;

import items.Armour;
import items.Treasure;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static items.Weapon.CLUB;
import static items.Weapon.SWORD;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EnemyTest {

    Enemy enemy;
    Warrior warrior;

    @Before
    public void setUp() {
        enemy = new Enemy("Ben", "Troll", 100, Armour.NONE, CLUB);
        warrior = new Warrior("Eve", "Dwarf", 400, Armour.HELMET, SWORD);
    }

    @Test
    public void hasName() {
        assertEquals("Ben", enemy.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Troll", enemy.getType());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, enemy.getHealth());
    }

//    @Test //random weapon generated. Test void.
//    public void hasWeapon() {
//        assertEquals(CLUB, enemy.getWeapon());
//    }

//    @Test //random weapon generated. Test void.
//    public void hasWeaponDamage() {
//        assertEquals(40, enemy.getWeaponDamage());
//    }

//    @Test //random armour generated. Test void.
//    public void canDefend() {
//        enemy.defend(80);
//        assertEquals( 60 , enemy.getHealth()); // make sure enemy attack goes down
//    }

    @Test
    public void canAttack() {
        enemy.attack(warrior);
        assertNotEquals(400, warrior.getHealth()); // make sure warrior health goes down
    }




}

