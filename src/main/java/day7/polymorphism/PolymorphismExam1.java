package day7.polymorphism;

import day7.casting.Bow;

public class PolymorphismExam1 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();

        warrior.age = 20;
        warrior.weapon = new Bow();
        warrior.weapon = new Sword();
    }
}
