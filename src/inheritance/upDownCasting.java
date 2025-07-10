package inheritance;
class Vehicle{
    void drive(){
        System.out.println("Driving a vehicle..");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("driving a car..");
    }
    void speedUp(){
        System.out.println("Speeding Up..");
    }
}
public class upDownCasting {
    public static void main(String[] args){
        //UpCasting
        Vehicle vehicle1 = new Car();
        vehicle1.drive();

        //DownCasting
        Vehicle vehicle = new Car();
        Car car = (Car) vehicle; //down casting
        car.drive();
        car.speedUp();
    }
}
