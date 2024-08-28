package day4.methodExamSolve.exam9;

public class Exam9 {
    public static void main(String[] args) {

        Test t1 = new Test();

        // 0은 양수로 보겠습니다.
        int no = -1;

        if(t1.isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.
    }
}
