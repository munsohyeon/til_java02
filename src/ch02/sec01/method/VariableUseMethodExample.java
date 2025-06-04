package ch02.sec01.method;

public class VariableUseMethodExample {
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
//        System.out.println(+hour +"시 " + min + "분에 호출 완료!\n");
//        //System.out.printf("%02d:%02d\n",hour, min);
//            System.out.print(hour < 10 ? "0" + hour : hour);
//            System.out.print(":");
//            System.out.print(min < 10 ? "0" + min : min);
        String strTime1 = parseTime(hour);
        String strTime2 = parseTime(min);
        System.out.println(strTime1 + ":" +strTime2);
        // System.out.println(parseTime(strTime1)+ ":" + parseTime(strTime2));
    }

    // 똑같은 메소드 생성하는 것을 오버로딩
    public static void printTime (int hour, int min, int sec){
        System.out.println(hour +"시 " + min + "분에 호출 완료!\n");
        //System.out.printf("%02d:%02d\n",hour, min);
         String strHour = hour < 10 ? "0" + hour: String.valueOf(hour);
        System.out.print(strHour + ":");
        printTime(min, sec);
        // System.out.println(parseTime(hour) + ":");
        // printTime(min, sec);
    }
}
