public class Monster {
double health= Math.ceil(Math.random() * (901 -575) + 575);
int swipeDamage = 25;

boolean attackLands() {
    double chanceOfMiss = Math.random();
    if (chanceOfMiss > 0.75) {
        return false;
    }
    return true;
}
int damageDealt() {
    double chanceOfCleanStrike = Math.random();
    if (chanceOfCleanStrike > 0.15) {
        return 60;
    }
    return 110;
}
boolean perfectDodge() {
    double chanceOfSwipe = Math.random();
    if (chanceOfSwipe > 0.55) {
        return false;
    } 
    return true;
}
boolean isAttacking() {
    if (Math.random() <= 0.50) {
        return true;
    } 
    return false;
}
}
