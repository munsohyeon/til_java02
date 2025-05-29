package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVal1 = "홍길동";
        String strVal2 = "홍길동";

        // 동일성 (identity)
        // 동등성 (equality)

        System.out.println(strVal1 == strVal2);
        System.out.println(strVal1.equals(strVal2));

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        System.out.println(strVar3 == strVar4);
        System.out.println(strVar3.equals(strVar4));

    }
}
