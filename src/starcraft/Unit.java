package starcraft;

public abstract class Unit {
    protected int x; // 좌표
    protected int y; // 좌표y
    // 상속관계에서 접근 시켜줄수 있는게 protected

    // 이동
    public void move(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void stop() {
        System.out.println("현재 위치에 정지한다.");
    }
}
