package car;

public class Model5Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("Model5Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model5Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model5Car.pressAccelerator");
    }
}