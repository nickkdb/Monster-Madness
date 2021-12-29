public class Game {
    public static void main(String[] args) {
        Hero swordfighter= new Hero();
        swordfighter.health= 250;
        swordfighter.damage= 85;
        Monster vampire= new Monster();
        vampire.health= 500;
        vampire.damage= 50;
        for (int i= 0; i < 5; i++) {
            boolean attackLanded = swordfighter.attack();
            if (attackLanded) {
                vampire.health -= swordfighter.damage;
                System.out.println("The monster now has " + vampire.health + " remaining!");
            } else {
                System.out.println("Attack missed!");
            }
            boolean attackDodged= swordfighter.dodge();
            if (attackDodged) {
                System.out.println("You were able to dodge the Monster's attack!");
            } else {
                swordfighter.health -= vampire.damage;
                System.out.println("You now have " + swordfighter.health + " remaining!");
            }
        }
    }
}
