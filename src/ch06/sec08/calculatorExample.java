package ch06.sec08;

public class calculatorExample {
    // static이 있으면 객체 생성을 할수 있다.
    public static void main(String[] args) {
        // Calculator(): 기본 생성자
        // = 대입연산자 / 우측에 있는 값을 복사
        // new 객체 생성 (만드는것)
          Calculator cal = new Calculator();
          // 메소드 안에 선언되어 있다면 지역변수 그 외에는 전역변수
          int result1 = cal.plus(1, 2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + cal.plus(10, 20));
        System.out.println("result2: " + 30);

        cal.powerOn();


        cal.powerOff();

        System.out.println(" --- 끝 --- ");
        // 전역변수는 사람이면 지역변수는 하루살이다

    }
}
