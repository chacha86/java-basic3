package day7.composition;

public class LeeCorparation {
    public static void main(String[] args) {

        // Kildong이와 Kilsoon이를 고용해서 leeCorp가 java와 python 수주가 가능하도록 해주세요.

//        Kildong kildong = new Jinee();


        LeeCorp leeCorp = new LeeCorp();
        leeCorp.developer = new Kildong();
        leeCorp.kilsoon = new Kilsoon();

//        leeCorp.kildong = new Kildong();

        leeCorp.java(); // 자바 프로그래밍
        leeCorp.python(); // 파이썬 프로그래밍

    }
}

class LeeCorp {
    JavaDeveloper developer;
    Kilsoon kilsoon;

    public void java() {
        developer.java();
    }

    public void python() {
        kilsoon.python();
    }
}