package ch06.sec04;

public class StudentExample {
    /*
        void : 반환 타입으로 메인 메서드는 반환을 하지 않는다.
        main : 메서드의 이름이 main이다.
        String[] : 매개변수의 타입이 String[] 타입이다.
        args : args라는 이름의 매개변수이다.
     */
    public static void main(String[] args) {
        // student s1:참조형 주소값 저장 / Student 객체 주소값만 저장할수 있다.
        // student(): 기본 생성자
        Student s1 = new Student(); // 객체생성
        Student s2 = new Student();

        s1.introduce();
        s2.introduce();

        s1.name = "홍길동";
        s2.name = "신사임당";

        s1.introduce();
        s2.introduce();
    }
}
