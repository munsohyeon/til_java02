package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
    /*
        커맨드창으로 값을 입력받을것이다.

        점수를 입력해주세요 > 60 (입력 후 엔터)

        (점수가 60점 이상이면) " 합격입니다."
        (아니다) "불합격입니다."

        출력되면 됩니다.
     */

        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 점수는?! 🥁🥁🥁 >> ");
        int score = scanner.nextInt();

        // String str = scanner.next();
        // int score = Integer.parseInt(str);

        if (score >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("다음기회에...😥");
        }
    }
}

