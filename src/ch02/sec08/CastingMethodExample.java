package ch02.sec08;

import ch06.sec08.Calculator;

public class CastingMethodExample {
    public static void main(String[] args) {

        double r1 = division(10, 3);
        System.out.println("r1: " + r1) ;
        System.out.println("r2: " + division(100, 32)) ;
    }

    public static double division(int i, int i1) {
        double result = (double) i / (double) i1;
        return result;
    }

}
