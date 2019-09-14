package characters;

import behaviours.IAttack;
import behaviours.IDefend;
import items.Armour;
import items.Weapon;

public class Warrior extends GameCharacter implements IAttack, IDefend {

    private Armour armour;
    private Weapon weapon;

    public Warrior(String name, String type, int health, Armour armour, Weapon weapon) {
        super(name, type, health);
        this.armour = armour;
        this.weapon = weapon;
    }


    //ARMOUR ENUM
    public Armour getArmour() {
        return armour;
    }

    public int getArmourResistance() {
        return armour.getResistance();
    }

    //setArmour to allow user to select armour for character
    public void setArmour(Armour armour) {
        this.armour = armour;
    }


    //WEAPON ENUM
    public Weapon getWeapon() {
        return weapon;
    }

    //setWeapon to allow user to select weapon for character
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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


}
