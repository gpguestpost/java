/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author nisar
 */
public class Car extends Vehicle {
    int numDoors;
    
    Car(String brand, double speed, int numDoors){
      super(brand, speed);
      this.numDoors = numDoors;
    }
    
    void showDetails(){
        System.out.println("Car Details: ");
        super.showDetails();
        System.out.println("Doors: " +  numDoors);
    }
    
}
