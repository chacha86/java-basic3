package day3;

// 명명 규칙
// 클래스명은 대문자 시작
// 의미가 바뀔 때 대문자로 구분. 두 단어 이상의 조합으로 이름 지을 때 단어 의미가 바뀌면 바뀌는 단어의 앞문자를 대문자로
// 카멜 표기법
// 함수나 변수는 소문자로 시작.

import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {

        // 명령어 입력 : help
        // add : 이름 입력
        // list : 이름 목록
        // exit : 종료
        // 명령어 입력 : add
        // 이름을 입력해주세요 : john
        // 나이를 입력해주세요 : 24
        // john이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john, 24
        // =====================
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // 나이를 입력해주세요 : 31
        // tomas이 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : chris
        // 나이를 입력해주세요 : 18
        // chris이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john, 24
        // 2. tomas, 31
        // 3. chris, 18
        // =====================
        // 명령어 입력 : exit
        // 이름 프로그램이 종료됩니다.

        // 배열이 어려우면 일단 한명의 이름을 저장하고 출력해본다.
        Scanner sc = new Scanner(System.in);
//        String name = ""; // 변수를 배열로 교체
        String[] names = new String[5];
        int[] ages = new int[5];

        int index = 0;

        while(true) {

            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if(command.equals("help")) {
                System.out.println("add : 이름 추가");
                System.out.println("list : 이름 목록 확인");
                System.out.println("exit : 종료");
            } else if(command.equals("add")) {
                System.out.println("이름을 입력해주세요 : ");
                names[index] = sc.nextLine();

                System.out.println("나이를 입력해주세요 : ");
                ages[index] = Integer.parseInt(sc.nextLine());

                System.out.println(names[index] + "이 명부에 저장되었습니다.");
                index++;

            } else if(command.equals("list")) {
                for(int i = 0; i < index; i++) {
                    System.out.println(names[i] + ", " + ages[i]);
                }

            } else if(command.equals("exit")) {
                System.out.println("이름 프로그램이 종료됩니다.");
                break;
            }
        }

        // "문자1" == "문자2"  틀린 비교
        // "문자1".equals("문자2") 올바른 비교

    }
}
