package variable;

public class Var9 {
    public static void main(String[] args) {
        int m = 10; // m 변수 생존 시작
        if (true) {
            int x = 20; // x 변수 생존 시작
            System.out.println("if > m = " + m);
            System.out.println("if > x = " + x);
        } // x 변수 생존 종료
        // System.out.println("main > x = " + x); // x 변수 사용 못함
        System.out.println("main > m = " + m);
    } // m 변수 생존 종료
}