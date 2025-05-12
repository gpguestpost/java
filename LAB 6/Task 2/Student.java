/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author nisar
 */
public class Student extends Person {

    int studentID;

    Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
    }
}
