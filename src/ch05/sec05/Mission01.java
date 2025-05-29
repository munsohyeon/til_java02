package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /*
            주민등록번호를 입력하시오. (xxxxxx-xxxxxxx) >

            (만약)주민등록번호길이가 다르면 "잘못 입력하셨습니다."
            (길이가 맞다면) 8번째자리의 값으로 "여성","남성" 출력해주세요.
            (8번째 자리가 1~4가 아니라면) "잘 못 입력하셨습니다."

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("주민등록번호를 입력해 주세요(xxxxxx-xxxxxxx)");
        System.out.print(">>");

        String num = scanner.next();
        int gen = num.length();
            char gender = num.charAt(7);

        if (num.length() != 14) {
            System.out.println("잘못 입력하셨습니다. 다시 해주세요.");
        } else {
            switch (gender) {
            case '1','3' -> System.out.println("남자");
            case '2','4' -> System.out.println("여자");
                default -> System.out.println("여성 남성으로 입력해주세요.");
            }
        }

    }
}
