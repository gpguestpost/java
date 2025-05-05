package Task3;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 240, 2);
        Bike b1 = new Bike("Honda", 140, "Dragon");

        c1.showDetails();
        System.out.println();
        b1.showDetails();

    }

}
