package ch06.sec04;

public class Student {
    public static void main(String[] args) {

    }

    String name;// 필드
    // 생성자가 없을때 컴파일러가 자동으로 넣어준다
    public Student() {
        // 기본 생성자
        System.out.println("기본 생성자 호출");
    }


    // 메소드
    void introduce() { // 구현부
        int num;
        System.out.printf("안녕 내 이름은 %s이라고 해\n", this.name);
    }
}
