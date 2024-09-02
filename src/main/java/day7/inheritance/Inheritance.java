package day7.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1.moew();
        c1.breathe();

        // 사람 만들어서 숨쉬게 하기


    }
}

class Animal {
    public void breathe() {
        System.out.println("숨쉬다~!");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍 짖다.");
    }
}

class Cat extends Animal {
    public void moew() {
        System.out.println("야옹");
    }
}
