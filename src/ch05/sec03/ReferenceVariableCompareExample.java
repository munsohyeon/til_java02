package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1, arr2, arr3;

        // 여기서 arr1 과 arr2는 다르다. 로드의 주소값 위치가 서로 다르기 때문에
        arr1= new int[] {1, 2, 3};
        arr2= new int[] {1, 2, 3};
        arr3= arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }

}
