package String;

public class StringMain4 {

    public static void main(String[] args) {
        String output = "";
        for (int i = 65; i < 91; i++) {
            char ch = (char) i;
            output += ch + " ";
        }
        System.out.println(output.trim());
    }
}
// result : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z