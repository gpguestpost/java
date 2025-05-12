/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author nisar
 */
public class Vehicle {
    String brand;
    double speed;
    
    Vehicle(String brand, double speed){
       this.brand = brand;
       this.speed = speed;
    }
    
    void showDetails(){
       System.out.println("Brand: " + brand);
       System.out.println("Speed: " + speed);
    }
    
}
