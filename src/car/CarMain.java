package car;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car k3Car = new K3Car();
        Car k4Car = new K4Car();
        Car k5Car = new K5Car();

        driver.setCar(k3Car);
        driver.driveK3();

        driver.setCar(k4Car);
        driver.driveK4();

        driver.setCar(k5Car);
        driver.driveK5();

        System.out.println();
        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.driveK3();

        System.out.println();
        Car model4Car = new Model4Car();
        driver.setCar(model4Car);
        driver.driveK4();

        System.out.println();
        Car model5Car = new Model5Car();
        driver.setCar(model5Car);
        driver.driveK5();
    }
}