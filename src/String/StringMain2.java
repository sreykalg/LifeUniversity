package String;

public class StringMain2 {
    public static void main(String[] args){

        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";

        System.out.println("new String() == : " + (str1 == str2));
        System.out.println("new String() equals() : " + str1.equals(str2));

        System.out.println("string literal == : " + (str3 == str4));
        System.out.println("string literal equals() : " + str3.equals(str4));


    }
}

// you should use equals for String comparison.
