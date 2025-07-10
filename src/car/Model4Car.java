package car;

public class Model4Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("Model4Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model4Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model4Car.pressAccelerator");
    }
}