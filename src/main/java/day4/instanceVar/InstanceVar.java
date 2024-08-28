package day4.instanceVar;

public class InstanceVar {
    public static void main(String[] args) {

        // 매개변수를 이용해 동작을 다채롭게
        Person p1 = new Person();
        p1.intro("홍길동");

        Person p2 = new Person();
        p2.intro("이순신");

        p1.walk("홍길동");
        p2.walk("이순신");


    }


}
