//package day7.polymorphism.exam2;
//
//public class PolymorphismExam2 {
//    public static void main(String[] args) {
//
//        Warrior warrior = new Warrior();
//
//        String name = "홍길동";
//        warrior.name = name;
//        warrior.age = 20;
//        warrior.introduce();
//        // 안녕하세요 저는 20살 홍길동입니다.
//
//        warrior.weapon = new Bow();
//        warrior.attack();
//        // 출력 : 홍길동이/가 활로 공격합니다.
//
//        warrior.weapon = new Sword();
//        warrior.attack();
//        // 출력 : 홍길동이/가 칼로 공격합니다.
//    }
//}
//class Warrior {
//    // 인스턴스 변수
//    String name;
//    // 인스턴스 변수
//    int age;
//    // 인스턴스 변수
//    Weapon weapon;
//
//    void introduce() {
//        System.out.println("안녕하세요. 저는 " + age + "살 " + name + " 입니다.");
//    }
//}
//
//class Weapon {
//
//}
//
//class Sword extends Weapon {
//
//}
//
//class Bow extends Weapon {
//
//}
