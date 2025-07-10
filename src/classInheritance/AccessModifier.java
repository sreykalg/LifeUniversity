package classInheritance;

import java.util.Scanner;

class Student2 {

    //Data Members
    private int studentId;
    private String studentName;
    int studentAge;
    Scanner s = new Scanner(System.in);

    //Member function
    public void acceptDetails(){

        System.out.println("Enter Student Id : ");
        studentId = s.nextInt();
        System.out.println("Enter Student Name : ");
        studentName = s.next();
        System.out.println("Enter Student Age : ");
        studentAge = s.nextInt();
    }

    public void displayDetails(){
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);

    }
}

public class AccessModifier{
    public static void main(String[] args){
        Student student = new Student();
        student.acceptDetails();
    }
}