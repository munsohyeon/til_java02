package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        //String 객체의 주소값이 hobby변수에 대입
        String hobby = "trip";
        // 여행문자열을 가지고 있는 String객체는 낙동강 오리알 신세
        hobby = null;

        String kind1 = "car";
        String kind2 = kind1;
        kind1 = null;
        System.out.println();
    }
}
