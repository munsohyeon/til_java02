package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        int a = (int)(Math.random()* 8.0 ) + 2;
        gugudan(a);
        /*
        4 x 1 = 4
        4 x 2 = 4
        ...
        4 x 9 = 4

         */
        System.out.println("------------------------");
        gugudan(4, 9); // 4 ~9단까지 구구단 출력
    }
    public static void gugudan(int gugu) {

        for (int i=1; i< 10; i++) {
            System.out.printf("%d x %d = %d\n", gugu, i, (i*gugu) );
        }
    }
    public static void gugudan(int gu, int dan) {

        for (int i=gu; i<=dan; i++) {
            System.out.printf("---%d단---\n",i);
            gugudan(i);
        }
    }

}
