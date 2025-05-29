package ch05.sec05;

import java.util.Random;
import java.util.Scanner;

public class SsnExample {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요.(yy):");
        String year = sc.nextLine();

        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = sc.nextLine();

        System.out.print("출생일을 입력해 주세요.(dd):");
        String day = sc.nextLine();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String sex = sc.nextLine();

        StringBuffer number = new StringBuffer();
        number.append(year+month + day + "-"); //주민번호 앞자리 생성
        if(sex.equals("m")) { //만약 성별이 남자일때
            number.append("3"); //주민번호 뒷자리가 3으로 시작
        }
        else if (sex.equals("f")) { //성별이 여자일때
            number.append("4"); //주민번호 뒷자리가 4로 시작
        }

        String backNumber = String.format("%06d",random.nextInt(999999)+1); //1~999999 범위 사이에 임의 번호 생성
        number.append(backNumber); //문자열에 랜덤으로 생성된 번호 추가

        System.out.println(number);

        char gender = number.charAt(7);
        System.out.println("gender: " + gender);

        System.out.println("------------");
        switch (gender) {
            case '2', '4':
                System.out.println("여자입니다.");
                break;
            case '1', '3':
                System.out.println("남자입니다.");
                break;
        }
    }
}
