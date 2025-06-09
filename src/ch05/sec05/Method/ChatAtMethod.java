package ch05.sec05.Method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); // "남자 리턴"
        String gender2 = checkGender("900212-2998756"); // "여자 리턴"

        System.out.println("gender: " + gender);
        System.out.println("gender: " + gender2);

    }

    public static String checkGender(String num) {
        char gen = num.charAt(7);
        switch (gen) {
            case '1', '3' :
                return "남자입니다.";
            case '2', '4' :
                return "여자입니다.";
            default:
                return null;
        }

    }
    /* return switch (ch) {
          case '2', '4' -> "여자"
          case '1', '3' -> "남자"
          default -> null;
          };
     */
}
