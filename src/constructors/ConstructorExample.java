package constructors;

public class ConstructorExample {
    public static void main(String[] args){

        Student student = new Student();
        student.displayDetails();

        Student student1 = new Student(101, "King", 23);
        student1.displayDetails();
    }
}

class Student{

    //Data Members
    private int studentId;
    private String studentName;
    private int studentAge;

    public Student(){
        this.studentId = 100;
        this.studentName = "Unknown";
        this.studentAge = 18;
    }
    public Student(int studentId, String studentName, int studentAge){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }


    void displayDetails(){
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
    }
}
