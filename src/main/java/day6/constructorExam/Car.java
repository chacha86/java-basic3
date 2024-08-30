package day6.constructorExam;

public class Car {
    String model;
    String color;
    int speed;

    public Car(String model, String color, int speed) {
        System.out.println("자동차가 만들어집니다.");
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public void drive() {
        System.out.printf("%s %s이/가 %dkm로 달립니다.\n", color, model, speed);
    }

}
