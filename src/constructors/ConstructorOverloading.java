package constructors;

public class ConstructorOverloading {
    public static void main(String[] args){

        Student student = new Student();
        student.displayDetails();

        Student student1 = new Student(101, "King", 23);
        student1.displayDetails();
    }
}

class Students{

    //Data Members
    private int studentId;
    private String studentName;
    private int studentAge;

    public Students(){
        this.studentId = 100;
        this.studentName = "Unknown";
        this.studentAge = 18;
    }
    public Students(int sId, String sName, int sAge){
        this.studentId = sId;
        this.studentName = sName;
        this.studentAge = sAge;
    }


    void displayDetails(){
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
    }
}
