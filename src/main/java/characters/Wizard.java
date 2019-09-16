package characters;

import behaviours.IAttack;
import behaviours.IDefend;
import items.Pet;
import items.Spell;

public class Wizard extends GameCharacter implements IAttack, IDefend {

    private Pet pet;
    private Spell spell;

    public Wizard(String name, String type, int health, Pet pet, Spell spell) {
        super(name, type, health);
        this.pet = pet;
        this.spell = spell;
    }

    public Pet getPet() {
        return pet;
    }

    public Spell getSpell() {
        return spell;
    }

    public int getPetDefence() {
        return pet.getDefence();
    }

    public int getSpellDamage() {
        return spell.getDamage();
    }

    public void defend(int attackPower) {
        int postPetDamage = attackPower / pet.getDefence();
        this.takeDamage(postPetDamage);
    }

    public void attack(IDefend defender) {
        int attackPower = this.getSpellDamage();
        defender.defend(attackPower);
    }

}
