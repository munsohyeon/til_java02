package ch07.sec07.poly2;

// TV는 Product를 상속 받는다
// TV의 가격은 100 만원입니다.(무조건)
// TV객체의 주소값을 println에 찍으면 "TV"가 출력되어야 한다. > toString 메소드 오버라이딩
public class Tv extends Product {

    public Tv () {
        super(100);
    }
    @Override
    public String toString() {
        return "TV";
    }

}
