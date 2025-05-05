package Task3;

public class Vehicle {

    String brand;
    double speed;

    Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

}
