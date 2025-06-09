package ch04.sec04.method;

public class Mission01Method {
    public static void main(String[] args) {
        int sum = sumFromTo(10, 20); // 10~20까지 모두 더한 값 리턴
        int sum2 = sumFromTo(15, 49); // 15~49까지 모두 더한 값 리턴
        System.out.println("result: " + sum);
        System.out.println("result2: " + sum2);
    }

    public static int sumFromTo(int s1, int s2) {
        int sum =0;
        for (int i=s1; i<=s2; i++) {
            sum += i;
        }
            return sum;
    }
}
