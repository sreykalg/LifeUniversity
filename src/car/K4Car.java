package car;

public class K4Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("K4Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("K4Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K4Car.pressAccelerator");
    }
}