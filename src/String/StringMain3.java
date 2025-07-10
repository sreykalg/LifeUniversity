package String;

public class StringMain3 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("world");
        str1.concat(str2);

        String str3 = "hello";
        String str4 = "world";
        str3.concat(str4);

        System.out.println("str1 = " + str1);
        System.out.println("str3 = " + str3);
    }

}
