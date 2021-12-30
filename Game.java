public class Game {
    static void createCharacter(String character) {
        if (character.equals("bruiser")) {
            Bruiser myHero = new Bruiser();
        } else if (character.equals("swordsman")) {
            Swordsman myHero = new Swordsman();
        } else {
            Streetfighter myHero = new Streetfighter();
        }
    }
    
}
