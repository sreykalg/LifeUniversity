package Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadInputFromUser {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Name : ");
        String name = s.nextLine();
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        System.out.print("Enter your Gender(F/M) : ");
        char gender = s.next().charAt(0);
        System.out.print("Enter your contact : ");
        double num = s.nextDouble();

        System.out.println(" User detail: ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Contact : " + num);

    }
}
