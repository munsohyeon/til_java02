package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;
// static 메소드 외의 메소드를 사용할려면 무조건 객체를 생성하여야 한다.
public class Mission03Method {
    // void 리턴타입, Mission03Method 메소드명, 매개변수(파라미터)
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star: " + star);

        // 콘솔에 출력
        // 5였다면 ***** (개행)
        // 3였다면 *** (개행)

        printSingleLine(star);
        System.out.println("----------------------------");
        printMultiLine(4);
        System.out.println("----------------------------");
        printTriangleLine(4);
    }


    public static void printSingleLine(int star) {

        for (int i=0; i< star; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    public static void printMultiLine(int multi) {
        for (int i = 0; i < multi; i++) {
            printSingleLine(multi);
        }



    }
    public static void printTriangleLine(int sta) {
        for (int i = 1; i <= sta; i++) {
            printSingleLine(i);
        } if(sta == 0) {
                    System.out.println();
        }
            }
        }




        /*
         for(int i=1; i<= 5; i++) {
        for(int j=1; j<=i; j++) {
        System.out.print("*");
                if(j==i) {
        System.out.println();
                }*/

        //String str = "*".repeat(multi);



