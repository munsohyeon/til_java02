package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 변수에 주소값 저장
        // new 키워드는 객체 생성시에 사용하는 연산자
        Car car = new Car();

        System.out.println("모델명: " + car.model);
        System.out.println("시동여부: " + car.start);
        System.out.println("현재속도: " + car.speed);

        Car car2 = new Car();

        System.out.println("모델명: " + car2.model);
        System.out.println("시동여부: " + car2.start);
        System.out.println("현재속도: " + car2.speed);
    }
}
