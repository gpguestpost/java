/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author nisar
 */
public class Bike extends Vehicle {
    String helmentType;
    
    Bike(String brand, double speed, String helmentType){
      super(brand, speed);
      this.helmentType= helmentType;
    }
    
    void showDetails(){
        System.out.println("Bike Details");
        super.showDetails();
        System.out.println("Helment Type: " + helmentType);
    }
    
}
