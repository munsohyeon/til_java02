package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        // static는 클래스명 써서 호출한다.
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.getInstance());
        System.out.println(singleton.getInstance());
        System.out.println(singleton.getInstance());
    }
}
