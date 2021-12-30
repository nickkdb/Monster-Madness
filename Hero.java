public class Hero {
    int health;
    int swipeDamage;
    int cleanStrikeDamage;
    int powerStrikeDamage;
    double powerStrikePercentage;
    int healPower;
    int healCount;
    double attackAccuracy;
    double dexterity;
    int specialCount;
    String special;
    boolean specialEquipped= false;
    boolean armorEquipped= false;
    int armorCount;

    void heal() {
        if (healCount > 0) {
            health += healPower;
            System.out.println("You used one heal, bringing your total up to: " + health + " HP.");
        }
    }
    void equipArmor() {
        if (armorCount > 0) {
            armorEquipped = true;
        } else {
            System.out.println("You don't have any armor remaining!");
        }
    }
    void equipSpecial() {
        if (specialCount > 0) {
            specialEquipped = true;
        } else {
            System.out.println("You don't have any " + special + "s remaining!");
        }
    }
    boolean attackLands() {
        double chanceOfMiss = Math.random();
        if (chanceOfMiss > attackAccuracy) {
            return false;
        }
        return true;
    }
    int damageDealt() {
        double chanceOfCleanStrike = Math.random();
        if (chanceOfCleanStrike > powerStrikePercentage) {
            return cleanStrikeDamage;
        }
        return powerStrikeDamage;
    }
    boolean isAttacking() {
        if (Math.random() <= 0.50) {
            return true;
        } else return false;
    }
    boolean perfectDodge() {
        double chanceOfSwipe = Math.random();
        if (chanceOfSwipe > dexterity) {
            return false;
        } 
        return true;
    }
}
