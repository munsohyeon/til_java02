package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char ch1 = 'A';

        System.out.printf("ch1: %c, %d\n", ch1, (int)ch1);
        System.out.printf("44032: %c, %d\n", 44032, 44032);

        String thx = "\u3042\u308A\u304C\u3068\u3046";
        System.out.println(thx + "❣");

        String str = "Hello";
        char[] strArr = str.toCharArray();
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);

        String str2 = "";
        char ch4 = ' ';
        System.out.printf("ch04: %d\n",(int) ch4);

        String emoji = "\uD83D\uDE02";
        System.out.println("이모지: " + emoji);

        int codePoint = emoji.codePointAt(0);
        System.out.printf("이모지 유니코드: U+%X\n", codePoint);
    }
}
