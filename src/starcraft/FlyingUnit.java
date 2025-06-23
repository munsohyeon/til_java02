package starcraft;

// 추상메소드가 있는 부모를 상속 받을려면 무조건 구현해야합니다(오버라이딩해야한다.)
public class FlyingUnit extends Unit{
    // 재정의
    @Override
    public void move(int x, int y) {
        System.out.println("공중으로 이동한다.");
        super.move(x, y);
    }

    }


