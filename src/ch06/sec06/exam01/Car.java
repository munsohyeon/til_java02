package ch06.sec06.exam01;

public class Car {
    // 필드가 3개
    String model;
    boolean start;
    int speed;

    // 클래스명과 같고 리턴타입이 없고 파라미터가 없을때 ' 기본 생성자'이다.
    // 생성자 호출하는 이유는
    public Car() {
        this.model = "제네시스 G80";
        this.speed = 20;
    }
}
