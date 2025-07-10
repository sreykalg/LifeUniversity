package String;

public class StringMain8 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("1").append("3").append("3").append("3").append("3").append("4");
        sb.insert(1, "2");
        sb.delete(3, 6);
        sb.append("5");

        System.out.println("sb.toString() = " + sb);
    }
}
// result
/*
sb.toString() = 12345
*/