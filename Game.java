public class Game {
    static void createCharacter(String character) {
        Monster theMonster = new Monster();
        if (character.equals("bruiser")) {
            Bruiser playerChoice = new Bruiser();
            playGame(playerChoice, theMonster);
        } else if (character.equals("swordsman")) {
            Swordsman playerChoice = new Swordsman();
            playGame(playerChoice, theMonster);
        } else {
            Streetfighter playerChoice = new Streetfighter();
            playGame(playerChoice, theMonster);
        }
    }

    static void playGame(Hero myhero, Monster monster) {
        for (int i = 0; i < 10; i++) {
            boolean heroAttacks = myhero.isAttacking();
            boolean monsterAttacks = monster.isAttacking();
            if (heroAttacks && monsterAttacks) {
                Fight.heroAttacksMonster(myhero, monster);
                Fight.monsterAttacksHero(myhero, monster);
            } else if (heroAttacks && !monsterAttacks) {
                Fight.monsterDefendsAttack(myhero, monster);
            } else if (!heroAttacks && monsterAttacks) {
                Fight.heroDefendsAttack(myhero, monster);
            } else {
                System.out.println("Neither fighter attacked. A staring contest ensued...");
            }
        }
    }
    
}
