/* 1. Implementing toString, equals
Let's create a Student class by referring to the following code and execution results.
Use the IDE function to create the toString(), equals() methods
*
* */
package objectPractice;

public class StudentMain {
    public static void main (String[] args){
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Alice", 20);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
    }
}
