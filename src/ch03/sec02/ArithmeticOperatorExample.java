package ch03.sec02;

public class ArithmeticOperatorExample {
    // 산술연산자
    public static void main(String[] args) {
        int v1 = 10, v2 = 4, v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1); // 14
        System.out.println("result2: " + ( v1 + v2 - v4)); // 4
        // double result3 = (double) v1 / v2;
        System.out.println("result3: " + (double) v1 / v2 ); // 2

        int result4 = v1 % v2; // % 모드 : 나머지값
        System.out.println("result4: " + result4); // 2

    }
}
