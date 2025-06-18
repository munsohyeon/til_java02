package ch07.sec07.poly2;

public abstract class Product {

    // 제품의 가격 점보를 저장할 수 있다.(price)
    // 제품구매 시 제공하는 보너스 점수 저장할 수 있다. (bonusPoint)
    // 캡슐화, immutable(불변화) -> 생성자
    // 외부에 값을 보내줄 수 있다. -> getter

    private int price; // 단위는 만원 단위
    private int bonusPoint;

    public Product(int price) {
        this.price = price;
        this.bonusPoint = price / 10; // 가격의 10%
    }
    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
}
