package day7.casting;

public class CastingExam {
    public static void main(String[] args) {
        // 변수는 수정하지 않습니다.
        int num1 = 10;
        int num2 = 4;

        // 정수는 정수끼리만 계산 -> 정수 계산 결과는 정수
        // 실수는 실수끼리만 계산 -> 실수 계산 결과는 실수
        System.out.println((double)num1 / num2); // 출력 : 2.500000
    }
}
