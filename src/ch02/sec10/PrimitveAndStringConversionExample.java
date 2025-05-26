package ch02.sec10;

public class PrimitveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        System.out.println("value1: " + value1);

        double value2 = Double.parseDouble("3.14");// Wrapper Type Class
        // double value2_1 = (double)"3.15:;
        System.out.println("value2: " + value2);

        boolean value3 = Boolean.parseBoolean("true");
        System.out.println("value3: " + value3);

        long value4 = Long.parseLong("100000");
        System.out.println("value4: " + value4);

        // int intValue = 10;
        // String str1 = intValue + "";
        String str1 = String.valueOf(10);
        System.out.println("str1: " + str1);

        String str2 = String.valueOf(value2);
    }
}
