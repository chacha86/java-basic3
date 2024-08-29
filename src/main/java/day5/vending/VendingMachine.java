package day5.vending;

public class VendingMachine {

    // 값을 세팅 X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠.
    int remainder = 0;

    public void inputMoney(int money) {
        remainder = remainder + money;
    }
}
