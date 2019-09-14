package characters;


import behaviours.IAttack;
import behaviours.IDefend;
import items.Armour;
import items.Weapon;

import java.util.Random;

import static items.Armour.getRandomArmour;
import static items.Treasure.getRandomTreasure;
import static items.Weapon.getRandomWeapon;

public class Enemy extends GameCharacter implements IAttack, IDefend {

    private Weapon weapon;
    private Armour armour;

    public Enemy(String name, String type, int health, Armour armour, Weapon weapon) {
        super(name, type, health);
        this.weapon = weapon;
        this.armour = armour;
        getInventory().addTreasureToInventory(getRandomTreasure());
        addRandomWeapon(getRandomWeapon());
        addRandomArmour(getRandomArmour());
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public int getWeaponDamage() {
        return weapon.getDamage();
    }

    public void defend(int attackPower){ //int damage
        int postArmourDamage = attackPower / armour.getResistance();
        this.takeDamage(postArmourDamage);
    }

    public void attack(IDefend defender) { //calls iDefend of attacked
        int attackPower = this.getWeaponDamage();
        defender.defend(attackPower);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    //Verified function
    public void addRandomWeapon(Weapon item) {
        setWeapon(item);
    }

    //Verified function
    public void addRandomArmour(Armour item) {
        setArmour(item);
    }






}