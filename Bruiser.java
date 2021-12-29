public class Bruiser {
    int health= 500;
    int damage= 35;
    int healPower= 60;
    int healCount= 3;
    int specialCount= 4;
    String special= "Shield";

    int attack() {
     double num= Math.random();
     if (num <= 0.60) {
         return 0;
     } else {
        if (Math.random() <= 0.70) {
            return 90;
        }
     } 
     return 130;
    }
    boolean dodge() {
        if (Math.random() < 0.450) {
            return true;
        }
        return false;
    }
    boolean willAttack() {
        if (Math.random() <= 0.60) {
            return true;
        }
        return false;
    }
}
