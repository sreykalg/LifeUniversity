package String;

public class StringMain1 {

    public static void main(String[] args){

        String str1 = "hello";
        // this one is incorrect
        // since String is not a primitive type, but it is a reference type (class)
        String str2 = new String("hello");
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
