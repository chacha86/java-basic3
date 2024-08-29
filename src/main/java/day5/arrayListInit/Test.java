package day5.arrayListInit;

import java.util.ArrayList;

public class Test {

    int a = 10; // 변수 선언 => 선언과 동시에 초기화

    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>() {{
        add("apple");
        add("banana");
    }}; // ArrayList 선언과 동시에 초기화

    int[] arr = new int[5];
    int[] arr2 = {1,2,3,4,5}; // 선언과 동시에 1,2,3,4,5를 대입

//    a = 10;// 대입 연산

    // 명령 코드 => 연산 은 class에서 실행 불가능. => 연산은 메서드에서만 가능.
    // 클래스에는 변수, 메서드 밖에 못옴.

//        a = 20; // 대입연산
//        a++; // 증가 연산
//
//        System.out.println("sdfsdf"); // 출력 연산
//



    public void print() {
        System.out.println("hihi");
    }
}
