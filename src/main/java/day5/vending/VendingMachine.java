package day5.vending;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {

    // 값을 세팅 X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠.
    int remainder = 0;
//    String[] names = {"콜라", "사이다", "커피"};
//    int[] prices = {1000, 1200, 800};
//    int[] quantities = {1, 2, 1};
    
    ArrayList<String> names = new ArrayList<>() {{
        add("콜라");
        add("사이다");
        add("커피");
    }};

    ArrayList<Integer> prices = new ArrayList<>(List.of(1000, 1200, 800));
    ArrayList<Integer> quantities = new ArrayList<>(List.of(1, 2, 1));

    public void inputMoney(int money) {
//        remainder = remainder + money; // 증감연산
        // 증감연산의 경우 짧게 표현하는 방법 존재.
        remainder += money; // 위와 같은 코드
    }

    public String selectBeverage(int target) {
        if(prices.get(target) > remainder) {
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감.
        }

        if(quantities.get(target) <= 0) {
            return "수량 부족";
        }

//        remainder = remainder - prices[target];
        remainder -= prices.get(target);

//        quantities[target] = quantities[target] - 1;
        quantities.set(target, quantities.get(target) - 1);
        return names.get(target);
    }

    public int getRemainder() {
        return remainder;
    }

    public void printBeverages() {
        System.out.println("== 음료수 목록 ==");
        for(int i = 0; i < names.size(); i++) {
            System.out.println(i + ". " + names.get(i) + " : " + prices.get(i) + "원, " + "남은 수량 : " + quantities.get(i));
        }
    }
}
