package blackjack;


/*
   무늬 pattern - Spade, Heart, Clover, Diamond
   값 denomination - A,2, 3, 4, 5, ... 9, 10, J, Q, K
 */
public class Card {
    private String pattern;
    private String denomination;


    public Card(String pattern, String denomination) {
        // this는 자기 자신
        this.pattern = pattern;
        this.denomination =denomination;
    }

    // set가 빠진 메소드 불변(이뮤터블
    // SET 은 변수값을 할당하는 목적의 함수이기 때문에 외부로 부터 인자를 받아함. (쓰기)
    // GET 은 변수값을 반환하는 목적이기 때문에 return 이 필요 (읽기)
    public String getPattern() {
        return pattern;
    }
    public String getDenomination() {
        return denomination;
    }
    @Override // Annotation
    public String toString() {
        // return getPattern() + getDenomination();
        return String.format("%s%s", this.pattern, this.denomination);
    }

}
    // 생성자: 리턴타입없어야 하고 클래스명이 같아야한다.
    // 생성자를 만드는 이유: 객체 생성을 하기 위해
    // 기본 생성자 : 모든 클래스에 자동으로 만들어주는 거
