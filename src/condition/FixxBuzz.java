package condition;

import java.util.Scanner;

public class FixxBuzz
{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number ; i++) {
            if( i % 5 == 0)
                System.out.println("FizzBuzz");
            else if( i % 3 == 0)
                System.out.println("Fizz");
            else if( i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println(" ");


        }
    }
}
