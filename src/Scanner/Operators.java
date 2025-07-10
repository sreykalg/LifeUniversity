package Scanner;

public class Operators {
    public static void main(String[] args){
        //Arithmetic Operator
        int num1 = 100;
        int num2 = 50;

        System.out.println("Additional Operator : " + (num1 + num2));
        System.out.println("Substraction Operator : " + (num1 - num2));
        System.out.println("Multiplication Operator : " + (num1 * num2));
        System.out.println("Division Operator : " + (num1 / num2));
        System.out.println("Remainder Operator : " + (num1 % num2));

        System.out.println("Post Increment : " + (num1++));
        System.out.println("Pre Increment : " + (++num1));

        System.out.println("Post decrement : " + (num1--));
        System.out.println("Pre decrement : " + (--num1));

        //Assignment Operators
        /*
        Are very commonly used, They assign value to a variable
        =, +=, -=, *=, /=, %=
        * */
        int num3 = 10;
        int num4 = 20;
        int num5;

        num5 = num3;
        System.out.println("num3 = num1" + num5);
        num3 += num4; //num1 = num1 + num2
        System.out.println("num3 += num5" + num3);
        num3 -= num4; //num1 = num1 - num2
        System.out.println("num3 -= num4" + num3);
        num3 /= num4; //num1 = num1 / num2
        System.out.println("num3 /= num4" + num3);

    /* Relational Operator
     determine if one operand is greater tham, less than, equal to or not equal to another operand
     ==, !=, >, >=, <, <=
     */
      int num6 = 10;
      int num7 = 3;
      int num8 = 7;

      System.out.println("num1 > num2 : "  + ( num1 > num2));
      System.out.println("num1 < num2 : " + (num1 < num2));
      System.out.println("num1 >= num2 : " + (num1 >= num2));
      System.out.println("num1 <= num2 : " + (num1 <= num2));
      System.out.println("num1 == num2 : " + (num1 == num2));
      System.out.println("num1 != num2 : " + (num1 != num2));

      /*
      * Logical Operator
      * are used to check multiple conditions together
      * && Condition _ AND
      * || Condition _ OR
      * ! Condition Not
      *  */

        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        boolean isAtuhenticated = true;

        if(isAtuhenticated){
            System.out.println("you are logged in");
        }
        else {
            System.out.println("You are logged out");
        }
        String result = (isAtuhenticated) ? "Logged In" : "Logged Out";
        System.out.println(result);

        /*
        *  Operators Precedence
        *
        *
        * */

        int num9 = 50, num10 = 100, num11 = 30;
         int result1 = num9 + num10 * num11 / 10;

         System.out.println(result1);







    }
}
