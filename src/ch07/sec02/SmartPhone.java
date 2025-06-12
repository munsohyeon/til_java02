package ch07.sec02;

public class SmartPhone extends Phone{
    private boolean wifi;

        // super();  기본생성자가 자동으로 생성
        // this는 나 자신, super 직속 부모
    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("SmartPhone 생성자 호출!!");
    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public void internet() {
        System.out.println("인터넷에 연결 완료");
    }

    // 오버라이딩(메소드 재정의): 선언부가 완벽히 똑같아야 한다
    public void bell() {
        System.out.println("스마트폰이 울린다!!!");
    }
}
