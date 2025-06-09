package ch05.sec05.Method;

public class Mission02Method {
    public static void main(String[] args) {
        String ext = getExt("sadf.sdkf.jpg"); // "jpg"리턴
        String ext2 = getExt("sad222f.sdkf111.jpeg"); // "jpg"리턴

        System.out.println("name: " + ext);
        System.out.println("name: " + ext2);
    }

    public static String getExt(String name) {
        int ext = name.lastIndexOf(".");
        String end = name.substring(ext+1);
        return end;
        // return name.substring(ext+1);
    }
}
