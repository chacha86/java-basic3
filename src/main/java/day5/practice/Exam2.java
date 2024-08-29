package day5.practice;

import java.util.ArrayList;

public class Exam2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("황진이");
        names.add("임꺽정");
        names.add("강감찬");
        names.add("을지문덕");
        names.add("정약용");

        for(int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("임꺽정")) {
                names.set(i, "신사임당");
            }

            if(names.get(i).equals("을지문덕")) {
                names.set(i, "유관순");
            }
        }

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
//
//        names.set(1, "신사임당");
//        names.set(3, "유관순");

    }
}
