package ch04.sec04.method;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromTo(5, 8); //[5, 6, 7]
        int[] arr2 = makeArrayFromTo(15, 20); //[15, 16, 17, 18, 19]

        shuffArray(arr);
        shuffArray(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] makeArrayFromTo(int from, int to) {
        int num = to - from;
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++){
            // int val = from;
            arr[i] = from++;
        }
        return arr;
    }

    public static void shuffArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ran = (int)(Math.random()* arr.length);
            int temp = arr[ran];
            arr[ran] = arr[i];
            arr[i] = temp;
        }
    }
}
