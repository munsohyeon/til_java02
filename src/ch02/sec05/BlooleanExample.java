package ch02.sec05;

public class BlooleanExample {
    public static void main(String[] args) {

        boolean stop = true;
        if(stop) {
            System.out.println("중지");
        } else {
            System.out.println("시작");
        }

        int x = 10;
        boolean result1 = x == 20;
        boolean result2 = x != 20;
        System.out.println(result1);
        // 출력창에 불린 타입일때만 변수 앞에!를 붙일수 있다.
        System.out.println(!result2);

    }
}
