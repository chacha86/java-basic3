package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        // while, for




        // 구구단 2단 만들기

        // 2 X 1 = 2
        // 2 X 2 = 4
        // 2 X 3 = 6
        // ...
        // 2 X 9 = 18

        // 개인이 최대한 고민할 수 있는 시간 정한다.(30분)
        // 검색(구글, gpt)을 통해 해결()
        // 저한테 질문


        // 2단을 -> 3단으로 바꿔주세요.

        // 1 , 2 , 3, 4
//        for(int i = 1; i <= 4; i++) {
//            System.out.println(dan + " X " + i + " = " + (dan * i));
//        }


        // hi 100번 출력

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("hi");
            }
        }

        for(int dan2 = 2; dan2 <= 9; dan2++) {
            for(int i = 1; i <= 4; i++) {
                System.out.println(dan2 + " X " + i + " = " + (dan2 * i));
            }
        }

        // 사각형 만들기
        for(int height = 0; height < 5; height++) {
            for(int width = 0; width < 8; width++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
