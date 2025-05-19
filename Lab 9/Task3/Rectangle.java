/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task3;

/**
 *
 * @author f24mmg5
 */
public class Rectangle extends Shape implements Printable {
    
    public void area(double pie, double radius){
        System.out.println("Total Rectangle Area..." + (pie * radius * radius));
    }
    
    public void print(){
        System.out.println("Rectangle prints...");
    }
}
