package object;

public class ToStringMain2 {
    public static void main(String[] args) {

        Car1 car = new Car1("red");
        Dog1 dog1 = new Dog1("Buddy", 5);
        Dog1 dog2 = new Dog1("Bru", 3);

        System.out.println("toString() method output: ");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }
}

// Execution Result :
/*
*   toString() method output:
    com.example.demo_object.object.tostring.Car@6d06d69c
    * Car did not override toString, so Object's to String was called
    * Dog override toString, so it was called in the fom we wanted
    Dog{name='Buddy', age=5}
    Dog{name='Bru', age=3}
* */

