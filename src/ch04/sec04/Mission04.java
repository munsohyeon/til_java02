package ch04.sec04;

public class Mission04 {
    public static void main(String[] args) {
        //  2~12 랜덤값
        int dan = (int)(Math.random() * 8.0 ) + 2;

        for(int i=1; i<10; i++ ) {
                System.out.println( dan + "x" + i + "=" + (i*dan));
            }
        }
    }

