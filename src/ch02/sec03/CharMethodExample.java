package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToInt('c');
        printCharToInt('가');
        printCharToInt('!');

        int val = getCharToInt('c');
        System.out.println("val: " + val);
    }

    // void 메소드(변수가 없어서?)
    // 리턴타입, 메소드명, 매개변수, 실행블록
    public static void printCharToInt(char c) {
        System.out.printf("%c: %d\n", c, (int)c);
    }

    // return 메소드는 return을 생략할수 없다.
    public static int getCharToInt(char c) {
        return 0;
    }



}

