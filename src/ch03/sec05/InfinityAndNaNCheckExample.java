package ch03.sec05;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x/y;
        System.out.println("z: " + z);
        System.out.println("z: " + (5/0.0));
        //System.out.println("z: " + (5/0));

        // if문 안에는 boolean 타입밖에 없다!
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else  {
            System.out.println(z + 2);
        }
    }
}
