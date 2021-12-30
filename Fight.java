public class Fight {
    static void heroAttacksMonster(Hero player, Monster enemy) {
        if (player.attackLands()) {
            enemy.health -= player.damageDealt();
            System.out.println();
            System.out.println("Your attack landed against the monster! The monster now has: " + enemy.health + " HP remaining.");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Your attack missed!");
            System.out.println();
        }
    }
    static void monsterAttacksHero(Hero player, Monster enemy) {
        if (enemy.attackLands()) {
            player.health -= enemy.damageDealt();
            System.out.println();
            System.out.println("The monster's attack landed against you! You now have: " + player.health + " HP remaining.");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("The monster attacked you, but missed!");
            System.out.println();
        }
    }
    static void heroDefendsAttack(Hero player, Monster enemy) {
        if (!enemy.attackLands() || player.perfectDodge()) {
            System.out.println();
            System.out.println("You dodged the monster's attack, no damage was taken!");
            System.out.println();
        } else {
            player.health -= enemy.swipeDamage;
            System.out.println();
            System.out.println("You defended the monster's attack, but some damage was taken in the process. You now have: " + player.health + " HP remaining.");
            System.out.println();
        }
    }
    static void monsterDefendsAttack(Hero player, Monster enemy) {
        if (!player.attackLands() || enemy.perfectDodge()) {
            System.out.println();
            System.out.println("The monster dodged your attack, no damage was dealt.");
            System.out.println();
        } else {
            enemy.health -= player.swipeDamage;
            System.out.println();
            System.out.println("The monster defended your attack, but you dealt damage in the process. The monster now has: " + enemy.health + " HP remaining.");
            System.out.println();
        }
    }
}
