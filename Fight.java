public class Fight {
    void heroAttacksMonster(Hero player, Monster enemy) {
        if (player.attackLands()) {
            enemy.health -= player.damageDealt();
            System.out.println("Your attack landed against the monster! The monster now has: " + enemy.health + " HP remaining.");
        } else {
            System.out.println("Your attack missed!");
        }
    }
    void monsterAttacksHero(Hero player, Monster enemy) {
        if (enemy.attackLands()) {
            player.health -= enemy.damageDealt();
            System.out.println("The monster's attack landed against you! You now have: " + player.health + " HP remaining.");
        } else {
            System.out.println("The monster attacked you, but missed!");
        }
    }
}
