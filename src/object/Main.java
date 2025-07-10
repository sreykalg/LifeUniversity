package object;

public class Main {
    public static void main(String[] agrs){

        // Create Objects
        Car car = new Car();
        Dog dog = new Dog();

        action(car);
        action(dog);
    }

    // function
    private static void action(Object obj){

        // A compilation error occurs because `Object` does not have the `sound()` method of `dog` and the `move()` method of `car`.
        // So, we need downcasting tailored to each object.

        if(obj instanceof Car car){
            car.move();
        }
        else if(obj instanceof Dog dog){
            dog.sound();
        }
    }
}
