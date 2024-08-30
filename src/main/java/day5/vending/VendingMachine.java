package day5.vending;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {

    // 값을 세팅 X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠.
    int remainder = 0;
    ArrayList<Beverage> beverages = new ArrayList<>();

    public VendingMachine() {
        Beverage b1 = new Beverage("콜라", 1000, 1);
        Beverage b2 = new Beverage("사이다", 1200, 2);
        Beverage b3 = new Beverage("커피", 800, 1);
        beverages.add(b1);
        beverages.add(b2);
        beverages.add(b3);
    }


    public void inputMoney(int money) {
//        remainder = remainder + money; // 증감연산
        // 증감연산의 경우 짧게 표현하는 방법 존재.
        remainder += money; // 위와 같은 코드
    }

    public String selectBeverage(int target) {

        Beverage beverage = beverages.get(target);

        if(beverage.price > remainder) {
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감.
        }

        if(beverage.quantity <= 0) {
            return "수량 부족";
        }

//        remainder = remainder - prices[target];
        remainder -= beverage.price;

//        quantities[target] = quantities[target] - 1;
        //quantities.set(target, quantities.get(target) - 1);
        beverage.quantity--;

        return beverage.name;
    }

    public int getRemainder() {
        return remainder;
    }

    public void printBeverages() {
        System.out.println("== 음료수 목록 ==");
        for(int i = 0; i < beverages.size(); i++) {
            System.out.println(i + ". " + beverages.get(i).name + " : " + beverages.get(i).price + "원, " + "남은 수량 : " + beverages.get(i).quantity);
        }
    }
}
