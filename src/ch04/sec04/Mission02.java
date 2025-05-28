package ch04.sec04;

public class Mission02 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // for문 활용하기

        for (int i=1; i<=10; i++) {
            if ( i == 1) {
                System.out.print(i);
            } else {
                System.out.printf(", %d", i);
            }
        }
        System.out.println("");

        System.out.print(1);
        for (int i=2; i<=10; i++) {
                System.out.printf(", %d", i);
            }
        }
    }

