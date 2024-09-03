package day8.staticExam;

public class Person {
    int age;
    String name;
    static int avgAge;
     // 인류 평균 나이 : 80

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.avgAge = 80;
    }

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
    }

    public static void printAvgAge() {
        System.out.printf("인류 평균 나이는 %d살 입니다.\n", avgAge);
    }

    public static void walk() {
        System.out.println("사람이 걷습니다.");
    }
}
