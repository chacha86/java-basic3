package day4.methodExamSolve.exam10;

public class Test {
    public void printEven(int num) {
        for(int i = 1; i <= num; i++) {
            if(isEven(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }
}
