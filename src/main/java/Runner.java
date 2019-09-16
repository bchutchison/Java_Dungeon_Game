import characters.GameCharacter;
import characters.Warrior;
import characters.Wizard;
import items.Armour;
import items.Pet;
import items.Spell;
import items.Weapon;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to this simple game");
        System.out.println("Would you like to play as a warrior(enter 1) or a wizard(enter 2)?");

        String input = scanner.next();
        int playerType = parseInt(input);

        if(playerType == 1) {
            String prompt = String.format("Please enter your name :");
            System.out.println(prompt);
            String playerName = scanner.next();
            Warrior warrior = new Warrior(playerName, "Warrior", 600, Armour.getRandomArmour(), Weapon.getRandomWeapon());
        } else if(playerType == 2) {
            String prompt = String.format("Please enter your name :");
            System.out.println(prompt);
            String playerName = scanner.next();
            Wizard wizard = new Wizard(playerName, "Wizard", 300, Pet.DOG, Spell.FIREBALL);

        }

//        for(Warrior warrior: warrior.getName())
//        String output = String.format("Your player name is" + warrior.getName());
//        System.out.println(output);

    }
}
