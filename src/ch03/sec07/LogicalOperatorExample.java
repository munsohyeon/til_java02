package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = '가';
        System.out.println("charCode: " + charCode); //65

        if( 65 <= charCode && charCode <= 90 ) { // 대문자
            System.out.println("대문자이군요.");
        } else if (97 <= charCode && charCode <= 122 ) {
            System.out.println("소문자이군요.");
        } else {
            System.out.println("한국어이군요.");
        }

        /*
            true && true || false >> true
         */
        System.out.println("-------------------------------");

        int value = 6;

        if (value % 2 == 0  || value % 3 == 0) {
            System.out.println("2 또는 3 배수이군요");
        }

        System.out.println("-------------------------------");



    }
}
