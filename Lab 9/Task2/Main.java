
/* @author f24mmg5 */
package Task2;

public class Main {
    public static void main(String[] args){
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
    
        System.out.println("\nCar Interface Class Methods: \n");
        myCar.start();
        myCar.stop();
        
        System.out.println("\nBike Abstract Class Methods: \n");
        myBike.start();
        myBike.stop();
    
    }
    
}
