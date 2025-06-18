package etc;

public class study {
    /*
       - 다향성 3가지 대 전제
       1. 부모타입의 변수는 자식객체 주소값을 담을 수 있다.
       2. 자식타입의 변수는 부모 객체 주소값을 담을 수 있다.
       3. 타입을 알고 메소드를 (형변환해서) 호출할수 있다.

        -  " Child child = new Child();" 에서 Child child는
       Child 객체 주소값도 받을수 있고 자식 주소값도 받을 수 있다.

       - override

       - abstract
       1. 추상메소드
       (상 메소드를 단 하나라도 가지고 있다면 클래스는 추상 클래스가 되어야 한다.)
       2. 추상클래스는 객체화가 되지 않게 만든다(객체가 없더라도)






    @Override
    public String toString() {
        return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
}


package ch07.sec07.poly2;

public class Buyer {

    // 제품 구매 메서드
    public void buy(Product p) {
        if (money < p.getPrice()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        // 구매 처리
        money -= p.getPrice();
        bonusPoint += p.getPrice() / 10; // 예: 10% 적립
        System.out.println(p + "을/를 구입하였습니다.");
    }

    // 현재 상태 출력 (선택 사항)
    public void showInfo() {
        System.out.println("현재 남은 돈: " + money + "원");
        System.out.println("보너스 포인트: " + bonusPoint + "점");
    }

    // getter (필요 시)
    public int getMoney() {
        return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}





    */

}
