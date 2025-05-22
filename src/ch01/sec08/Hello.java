package ch01.sec08;
// 클래스 Full Name: cho01.sec08.Hello

/*
    클래스 선언
    Hello: 클래스명
    클래스명은 파일명과 동일하다.

 */
public class Hello { // 클래스 블록
    /*
        main 메소드 선언
        main: 메소드 명
        main 메소드는 프로그램으로 시작점.
     */
    // 메소드를 만드는 것은 선언, 사용하는 것은 호출
     public static void main(String[] args){ // 메소드 블럭
         // " " 쌍따옴표 사이는 문자열. 문자열 안에서는 주석처리 안 된다.
         System.out.println("Hello,/* 주석이 아닌 내용 */Java"); // println 메소드 호출
     }
}
