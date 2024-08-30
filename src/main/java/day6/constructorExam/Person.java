package day6.constructorExam;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        System.out.println("사람이 태어납니다.");
        this.age = age; // this는 메서드를 수행하는 객체를 의미한다.
        this.name = name;
    }

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
    }

}
