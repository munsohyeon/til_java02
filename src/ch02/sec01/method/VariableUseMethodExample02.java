package ch02.sec01.method;

public class VariableUseMethodExample02 {
    public static void main(String[] args) {
        //printTime(10, 20);
        printTime(2, 9);
        printTime(6, 20);

        printTime(2, 9, 2 );
    }

    public static String parseTime(int val) {
        return val < 10 ? "0" + val: String.valueOf(val);
    }
    public static void printTime (int hour, int min){
        System.out.println(parseTime(hour)+ ":" + parseTime(min));
    }

    // 똑같은 메소드 생성하는 것을 오버로딩
    public static void printTime (int hour, int min, int sec){

        System.out.println(parseTime(hour) + ":");
        printTime(min, sec);
    }
}


