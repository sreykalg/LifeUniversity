package object;

public class ToStringMain3 {

    public static void main(String[] args){
        Car1 car = new Car1("red");
        Dog1 dog1 = new Dog1("Buddy", 5);
        Dog1 dog2 = new Dog1("Bru", 3);

        System.out.println("toString() method output: ");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        // since we have objectprinter, we dont need to use car.toString() anymore
    }
}

// Execution Result :
/*
*
ObjectPrinter output:
Object info : com.example.demo_object.object.tostring.Car@7852e922
Object info : Dog{name='Buddy', age=5}
Object info : Dog{name='Bru', age=3}
* */
