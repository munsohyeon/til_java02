package ch02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\", \n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";
        System.out.println(str1);
        /*
            {
               "id":"winter",
	           "name":"눈송이"
	           // 여기서 id,name 은 키, winter,눈송이는 value
	        }
         */

        String str2 = """
                {
                    "id":"winter"
                    "name":"눈송이"
                }
                """;
        System.out.println(str2);

        String str3 = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겂니다.
                """;
        System.out.println(str3);
    }
}
