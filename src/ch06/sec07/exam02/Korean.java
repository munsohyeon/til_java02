package ch06.sec07.exam02;

public class Korean {
    String nation;
    String name;
    String ssn;

    public Korean() {
        // this는 자기 자신의 주소값이 저장된 상수
        this("신사임당", "901022-2754312");
    }

    // String name, String ssn 매개변수 / 매개변수에 this 값이 주입된다.
    public Korean(String name, String ssn) {
        this.nation = "대한민국";
        this.name = name;
        this.ssn = ssn;
    }
}
