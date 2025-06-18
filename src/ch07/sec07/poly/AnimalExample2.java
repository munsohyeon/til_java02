package ch07.sec07.poly;

public class AnimalExample2 {
    public static void main(String[] args) {
        //주소값 instanceof type 왼쪽이 주소값 오른쪽이 타입
        // 타입이 주소값을 저장할 수 있나?
        // 저장할 수 있으면 true, 없으면 false 결과가 된다.

        Tiger tiger = new Tiger();

        System.out.println(tiger instanceof Cat); // true

        Cat cat = tiger;
        System.out.println(cat instanceof Tiger); // true
        // true가 뜨는 이유는 이미 위에서 tiger 객체가 담겼기 때문

        System.out.println(cat instanceof Tiger);

        Tiger tiger2 = (Tiger)cat;

    }
}
