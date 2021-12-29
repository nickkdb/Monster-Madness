public class Monster {
double health= Math.ceil(Math.random() * (901 -575) + 575);

int attack() {
    double num = Math.random();
    if (num <= 0.80) {
        return 0;
    } else {
        if (Math.random() <= 0.850) {
            return 60;
        }
    }
    return 110;
}
boolean dodge() {
    double num= Math.random();
    if (num <= 0.450) {
        return true;
    }
    return false;
}
boolean willAttack() {
    if (Math.random() <= 0.50) {
        return true;
    } 
    return false;
}
}
