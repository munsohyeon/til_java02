package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("1.result: " + result);

        result = result + 10;
        System.out.println("2.reuslt: " + result);

        result += 10;
        System.out.println("3.reuslt: " + result);

        result -= 5;
        System.out.println("4.reuslt: " + result);

        result *= 2;
        System.out.println("5.reuslt: " + result);

        result /= 5;
        System.out.println("6.reuslt: " + result);

        result %= 5;
        System.out.println("7.reuslt: " + result);
    }
}
