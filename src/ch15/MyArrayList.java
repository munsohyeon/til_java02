package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return this.arr.length;
    }

    public void add(String item) {
        // arr.lenth +1 === size()+1
        String[] temp = new String[arr.length + 1];
        //temp[temp.length-1] = item;
        temp[size()] = item;
        // 기존값 복사

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void add(int index, String item) {

        String[] temp = new String[arr.length + 1];
        temp[index] = item;
        for (int i = 0; i < arr.length; i++) {
//            if (i < index) {
//                temp[i] = arr[i];
//            } else {
//                temp[i+1] = arr[i];
//            }
            temp[i < index ? i : i + 1] = arr[i];
        }
        arr= temp;


    }

    public String get(int str) {

        return arr[str];
    }

    // 점검용
    public void checkValues() {
        System.out.println(Arrays.toString(this.arr));
    }

    public String remove() {
        String[] temp = new String[size()-1];
        String ex = arr[temp.length];
        for (int i=0; i< temp.length; i++) {
            temp[i]=arr[i];
        }
        arr = temp;
        return ex;
    }
    public String remove(int str3) {
        String[] temp = new String[size()-1];
        String ex = arr[str3];
        for (int i=0; i<temp.length; i++){
            temp[i] = arr[i < str3 ? i : i + 1];
        }
        arr = temp;
        return ex;
    }
}

/*


    public void add(int index, String item) {
        if (index < 0 || index > arr.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + arr.length);
        }

        String[] temp = new String[arr.length + 1];

        // index 이전까지 복사
        for (int i = 0; i < index; i++) {
            temp[i] = arr[i];
        }

        // index 자리에 새로운 값 삽입
        temp[index] = item;

        // index 이후부터는 한 칸씩 뒤로 밀면서 복사
        for (int i = index; i < arr.length; i++) {
            temp[i + 1] = arr[i];
        }

        arr = temp;
    }

    public String get(int index) {
        return arr[index];
    }


 */