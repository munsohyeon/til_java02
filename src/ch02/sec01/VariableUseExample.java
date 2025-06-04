package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int min = 5;

        System.out.println(hour + "시간 " + min + "분" );

        int multi = hour * 60 + min ;
        System.out.println("총 " + multi + "분");

        System.out.printf("총 %d분", hour*60 + min);
    }
}
