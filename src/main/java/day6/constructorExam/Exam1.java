package day6.constructorExam;
public class Exam1 {
    public static void main(String[] args) {
        Person p1 = new Person(27, "홍길동"); // 사람이 태어납니다.

        Person p2 = new Person(25, "홍길순"); // 사람이 태어납니다.
        p1.introduce(); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(); // 안녕하세요 25살 홍길순입니다.
//
        Car c1 = new Car("소나타", "하얀색", 100); // 자동차가 만들어집니다.
        Car c2 = new Car("모닝", "검정색", 70); // 자동차가 만들어집니다.

        c1.drive(); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive(); // 검정색 모닝이/가 70km로 달립니다.
    }
}
