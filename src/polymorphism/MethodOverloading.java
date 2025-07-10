package polymorphism;
class Calculation{
    public static int addition (int num1, int num2){
        return num1 + num2;
    }
    public static int addition (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static float addition (float num1, float num2){
        return num1 + num2;
    }
    public static float addition(int num1, float num2){
        return num1 + num2;
    }

    public static float addition(float num1, int num2){
        return num1 + num2;
    }

}
public class MethodOverloading {
    public static void main(String[] args){
        System.out.println(Calculation.addition(100,20));
        System.out.println(Calculation.addition(100.50F,200));
        System.out.println(Calculation.addition(100,20.0F));
        System.out.println(Calculation.addition(100, 20, 30));
        System.out.println(Calculation.addition(10.50F, 30));

        
    }
}
