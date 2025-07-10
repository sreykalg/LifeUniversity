package String;

public class StringMain6 {

    public static void main(String[] args) {
        final int loopSize = 1_000_000;

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < loopSize; i++) {
            char ch = (char) i;
            str += ch + " ";
        }
        long endTime = System.currentTimeMillis();
        long strTime = endTime - startTime;

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loopSize; i++) {
            char ch = (char) i;
            sb.append(ch).append(" ");
        }
        String output = sb.toString();
        endTime = System.currentTimeMillis();
        long sbTime = endTime - startTime;

        System.out.println("String concatenation time: " + strTime + " ms");
        System.out.println("StringBuilder concatenation time: " + sbTime + " ms");
    }
}

// output
/*
String concatenation time: 83982 ms
StringBuilder concatenation time: 10 ms
*/