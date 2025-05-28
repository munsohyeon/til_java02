package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        // 10칸 짜리 정수 배열을 만들고 싶다.
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
        }

        // [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        for (int i = 0; i < arr.length; i++) {
            int ran = (int) (Math.random() * arr.length );
            int temp = 0;

            temp = arr[i];
            arr[i] = arr[ran];
            arr[ran] = temp;
        }
        System.out.println(Arrays.toString(arr));



    }
}
        /*
           0 ~ 9 랜덤값 구한다. 예를 들어 7이 나왔다. 0번방과 7번방 스와핑한다.
           0 ~ 9 랜덤값 구한다. 예를 들어 8이 나왔다. 1번방과 8번방 스와핑한다.
           0 ~ 9 랜덤값 구한다. 예를 들어 5이 나왔다. 2번방과 5번방 스와핑한다.
         */
