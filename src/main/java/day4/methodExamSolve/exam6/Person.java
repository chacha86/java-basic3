package day4.methodExamSolve.exam6;

public class Person {
    public void greeting1(int language) {
        if(language == 1) {
            System.out.println("안녕하세요");
        } else if(language == 2) {
            System.out.println("하이");
        } else if(language == 3) {
            System.out.println("봉쥬");
        }
    }

    public void greeting2(int language, int count) {
        for(int i = 0; i < count; i++) {
            greeting1(language);
        }
    }
}
