import java.util.Arrays;

import java.util.*;

public class Intro {
    
    static void start() {
        System.out.println("Would you like to play the game? (Enter: YES or NO)");
        String answer= IO.readString();
        if (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes")) {
            System.out.println();
            System.out.println("INVALID ENTRY, TRY AGAIN!!!");
            System.out.println();
            start();
        } else {
            if (answer.equalsIgnoreCase("no")) {
                System.out.println();
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println();
                playerSelection();
                System.out.println();
            }
        }
    }
    static void playerSelection() {
        System.out.println("OPTION ONE: BRUISER        OPTION TWO: SWORDSMAN       OPTION THREE: STREETFIGHTER");
        System.out.println("***to select a Hero, enter their name! For a game guide along with each Hero's strengths/abilities, enter 'GUIDE'***");

        String[] optionsArray = new String[]{"bruiser", "swordsman", "streetfighter", "guide"};
        List<String> optionsList = new ArrayList<>(Arrays.asList(optionsArray));
        
        String choice= IO.readString().toLowerCase();
        if (!optionsList.contains(choice)) {
            System.out.println();
            System.out.println("INVALID ENTRY, TRY AGAIN!!!"); 
            System.out.println();
            playerSelection();
        } else if (choice.equals("guide")) {
            openGuide();
        } else {
            Game.createCharacter(choice);
        }
    }

    static void openGuide() {
      System.out.println();
      System.out.println("To begin, choose your Hero!");
      System.out.println();
      System.out.println("Which hero you choose will alter your game experience, so choose wisely!");
      System.out.println();
      System.out.println("BREAKDOWN: Before each turn, you can use an item. Then, the hero and monster either attack, defend, or flee.");
      System.out.println("When attacking, your attack may or may not land. If it lands, it can land as a clean strike, or power hit.");
      System.out.println("When defending, an attack may be fully dodged, or partially dodged, which inflicts swipe damage.");
      System.out.println("You or the monster may flee before any turn. The monsters chance of fleeing varies throughout the fight.");
      System.out.println("Every Hero comes standard with two items: Armor, and heals. Your item stays equipped until used. (ex: won't lose equipped armor if you aren't attacked.)");
      System.out.println("Each of the Heroes have a unique special move or item that can help you win the fight vs the monster!");
      System.out.println("You can only use one item or special per turn, so manage your items wisely!");
      System.out.println("Along with their special, each Hero has different strengths on the battlefield, such as health attributes or accuracy.");
      System.out.println();
      System.out.println("BRUISER:");
      System.out.println("HEALTH: 500, DAMAGE: swipe= 35, clean strike= 90, power strike= 130, ITEMS: Heals(3x), Armor(1x), SPECIAL: Shield(2x)= When defending, dodge strike into counter attack of your own");
      System.out.println("the Bruiser is the powerhouse with high health and power, but it comes at the expense of accuracy and defense.");
      System.out.println();
      System.out.println("SWORDSMAN:");
      System.out.println("HEALTH: 425, DAMAGE: swipe= 25, clean strike= 70, power hit= 105, ITEMS: Heals(5x), Armor(1x), SPECIAL: Gunpowder Grenade(1x)= unblockable power strike");
      System.out.println("Swordsman is the balanced hero, with middle-of-the-pack attacks and defense, but his triprope guarantees an easy strike at any time.");
      System.out.println();
      System.out.println("STREETFIGHTER:");
      System.out.println("HEALTH: 350, DAMAGE: swipe= 20, clean strike= 60, power hit= 90, ITEMS: Heals(7x), Armor(1x), SPECIAL: Taunt(1x, lasts 4 turns)= monster chance of fleeing increases 2x");
      System.out.println("Streetfighter doesn't have the health or power of his counterparts, but has stellar defense and can end fights early with his taunting.");
      System.out.println();
      System.out.println("Hit enter to continue");
      System.out.println();
      String closeGuide= IO.readString();
      if (closeGuide.length() >= 0) playerSelection();
    }
}
