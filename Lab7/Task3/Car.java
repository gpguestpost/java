package Task3;

public class Car extends Vehicle {

    int numDoors;

    Car(String brand, double speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    void showDetails() {
        System.out.println("Car Details: ");
        super.showDetails();
        System.out.println("Doors: " + numDoors);
    }

}
