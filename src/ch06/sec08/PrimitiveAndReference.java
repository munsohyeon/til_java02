package ch06.sec08;

public class PrimitiveAndReference {
    public static void main(String[] args) {
        int num = 10;
        Numbox numbox = new Numbox();
        numbox.num = 10;

        changNum(num);

        System.out.println("num: " +num); //10


        numbox.num =10;
        changNum(numbox);
        System.out.println("numbox.num: " + numbox.num); //20..?
    }


    public static void changNum(int num) {
        num = 20;
    }

    public static void changNum(Numbox numbox) {
        numbox.num = 20;
    }
}

class Numbox {
    int num;
}