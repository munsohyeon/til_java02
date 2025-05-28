package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
    // 3~8 랜덤값 생성
    int star = (int)(Math.random() * 6.0 ) + 3;
        System.out.println("값: " + star);
        //******
        for (int i=0; i< star; i++) {
            for (int k=0; k<star; k++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
