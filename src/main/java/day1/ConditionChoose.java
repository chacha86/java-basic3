package day1;

public class ConditionChoose {
    public static void main(String[] args) {

        // 택일구조

        // 남녀 (양자택일)

        // 학적 (사자택일)

        // 성적 (오자택일)

        // 학적
        int age;
        age = 21;

        if (age <= 8) {
            System.out.println("초등");
        }
        else if (age <= 16) {
            System.out.println("중등");
        }
        else if (age <= 19) {
            System.out.println("고등");
        }
        else {
            System.out.println("성인");
        }

        // 성적 출력

        int score;
        score = 70;

        // 점수가 90 ~ 100 : A
        // 점수가 80 ~ 89 : B
        // 점수가 70 ~ 79 : C
        // 점수가 60 ~ 69 : D
        // 점수가 60 미만 : F


    }
}
