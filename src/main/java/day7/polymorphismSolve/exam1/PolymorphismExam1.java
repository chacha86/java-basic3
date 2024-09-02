package day7.polymorphismSolve.exam1;

public class PolymorphismExam1 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();

        warrior.age = 20;
        warrior.weapon = new Bow();
        warrior.weapon = new Sword();
    }
}

class Warrior {
    int age;
    Weapon weapon;
}
class Weapon {

}

class Bow extends Weapon {

}

class Sword extends Weapon {

}