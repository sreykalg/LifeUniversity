package car;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    //driver K3
    public void driveK3() {
        System.out.println("K3 자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }

    //driver K4
    public void driveK4() {
        System.out.println("K4 자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }

    //driver K5
    public void driveK5() {
        System.out.println("K5 자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}