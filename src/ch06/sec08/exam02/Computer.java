package ch06.sec08.exam02;

public class Computer {

    public int sum(int... values) {

        int sum =0;
        //int i = 0; i < values.length; i++
        for (int item : values) {
            //sum += values[i];
            sum += item;
        }
        return sum;
    }

}
