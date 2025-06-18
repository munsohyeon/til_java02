package ch07.sec07.poly2;

// 켑슐화
// 본인이 가지고 있는 소유 금액을 저장 할수 있다.(money) 🌟
// 소유금액은 만원단위이면 일천만원을 기본적으로 가지고 있다. 🌟
// 제품 구매시 보너스 점수를 저장할 수 있다.(bonusPoint) 🌟
// 컴퓨터, 티비를 구매할 수 있다. buy 메소드 🌟
// 구매시 제품 가격만큼 소유금액은 차감된다.🌟
// 구매시 구매한 제품이름이 출력된다.🌟
// e.g. "Tv을/를 구입하였습니다.🌟
// e.g "Computer을/를 구입하였습니다."🌟
// 구매시 보너스 포인트를 적립된다.
// 구매시 소유금액이 부족하면 "잔액이 부족합니다."🌟
// 내용이 출력되면서 구매하지 않는다.🌟

public class Buyer{
    // 소유 금액 저장및 기본천만원(만원단위)
    private int money = 1000;

    // 보너스 점수 저장
    private int bounusPoint;

    public void buy(Product product) {
        if (money < product.getPrice()) {
            System.out.println("잔액 부족");
            return;
        } else {
            money -= product.getPrice();
            bounusPoint += product.getBonusPoint();
            System.out.println(product + "구입 완료!");
        }
    }

    // getter
    public int getMoney() {
        return money;
    }

    public int getBounusPoint() {
        return bounusPoint;
    }
    public void savemoney() {
        System.out.println("남은 금액 " + money + "만원");
        System.out.println("쌓인 포인트 " + bounusPoint + " point");
    }


}
