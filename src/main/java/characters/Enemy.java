package characters;


import behaviours.IAttack;
import behaviours.IDefend;
import items.Treasure;
import items.Weapon;

import java.util.ArrayList;

import static items.Treasure.getRandomTreasure;

public class Enemy extends Entity {

    private Weapon weapon;

    public Enemy(String name, String type, int health, Weapon weapon) {
        super(name, type, health);
        this.weapon = weapon;
        getTreasure(getRandomTreasure());
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getWeaponDamage() {
        return weapon.getDamage();
    }

    public void defend(int attackPower){ //int damage
        int postArmourDamage = attackPower;
        this.takeDamage(postArmourDamage);
    }

    public void attack(IDefend defender) { //calls iDefend of attacked
        int attackPower = this.getWeaponDamage();
        defender.defend(attackPower);
    }

}