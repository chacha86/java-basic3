package day5.vending;

public class VendingMachine {

    // 값을 세팅 X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠.
    int remainder = 0;
    String[] names = {"콜라", "사이다", "커피"};
    int[] prices = {1000, 1200, 800};

    public void inputMoney(int money) {
        remainder = remainder + money;
    }

    public String selectBeverage(int target) {
        if(prices[target] > remainder) {
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감.
        }

        remainder = remainder - prices[target];
        return names[target];
    }

    public int getRemainder() {
        return remainder;
    }

    public void printBeverages() {
        System.out.println("== 음료수 목록 ==");
        for(int i = 0; i < names.length; i++) {
            System.out.println(i + ". " + names[i] + " : " + prices[i] + "원");
        }
    }
}
