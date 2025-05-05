package Task3;

public class Bike extends Vehicle {

    String helmentType;

    Bike(String brand, double speed, String helmentType) {
        super(brand, speed);
        this.helmentType = helmentType;
    }

    void showDetails() {
        System.out.println("Bike Details");
        super.showDetails();
        System.out.println("Helment Type: " + helmentType);
    }

}
