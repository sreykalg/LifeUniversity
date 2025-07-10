package car;

public class K5Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("K5Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("K5Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K5Car.pressAccelerator");
    }
}