package day5.problemSolve;

import java.util.ArrayList;

public class Exam3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";

        // 1. 네 사람을 ArrayList에 저장
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println("=====================================");
        // 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)
        for(int i = 0; i < people.size(); i++) {
            people.get(i).introduce();
        }
        System.out.println("=====================================");
        // 3. 30대인 사람에게만 자기소개 시키기
        for(int i = 0; i < people.size(); i++) {
            if(people.get(i).age >= 30) {
                if(people.get(i).age < 40) {
                    people.get(i).introduce();
                }
            }
        }
    }
}
