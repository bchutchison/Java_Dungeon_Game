package characters;


import behaviours.IAttack;
import behaviours.IDefend;
import items.Weapon;

import java.util.Random;

import static items.Treasure.getRandomTreasure;
import static items.Weapon.getRandomWeapon;

public class Enemy extends GameCharacter implements IAttack, IDefend {

    private Weapon weapon;

    public Enemy(String name, String type, int health, Weapon weapon) {
        super(name, type, health);
        this.weapon = weapon;
        getInventory().addTreasureToInventory(getRandomTreasure());
        addRandomWeapon(getRandomWeapon());
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


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //Verified
    public void addRandomWeapon(Weapon item) {
        setWeapon(item);
    }

    //Verified
    public int createRandomNumber() {
        Random num = new Random();
        int answer = num.nextInt(10) +1;
        return answer;
    }




}