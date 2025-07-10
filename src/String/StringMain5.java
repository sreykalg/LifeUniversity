package String;

public class StringMain5 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 65; i < 91; i++) {
            char ch = (char) i;
            sb.append(ch).append(" ");
        }
        String output = sb.toString();
        System.out.println(output.trim());
    }
}
