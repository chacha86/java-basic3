package day4.methodExamSolve.exam7;

public class Exam7 {
    public static void main(String[] args) {

        Test t1 = new Test();

        int a = t1.func1();
        System.out.println(a);
        // 출력 : 10
        int b = t1.func1();
        System.out.println(b);
        // 출력 : 10

        int c = t1.func2(22);
        System.out.println(c);
        // 출력 : 22

        int d = t1.func2(55);
        System.out.println(d);
        // 출력 : 55

        int e = t1.func3(10);
        System.out.println(e);
        // 출력 : 100
        int f = t1.func3(5);
        System.out.println(f);
        // 출력 : 25

        int g = t1.func4(10, 30);
        System.out.println(g);
        // 출력 : 40

        int h = t1.func4(20, 50);
        System.out.println(h);
        // 출력 : 70
    }
}
