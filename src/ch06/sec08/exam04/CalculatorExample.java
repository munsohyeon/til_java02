package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        // 한변의 길이가 40인 정사각형의 넓이를 구하고 싶소잉.
        Calculator cal = new Calculator();

        double result = cal.areaRectangle(40);

        System.out.println("result: " + result);

        // 가로 40, 세로 50인 직사각형 넓이를 구하거라
        double result2 = cal.areaRectangle(50, 40);
        System.out.println("result2: " + result2);
    }
}
