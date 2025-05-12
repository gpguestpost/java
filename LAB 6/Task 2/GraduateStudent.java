/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author nisar
 */
public class GraduateStudent extends Student {

    String researchTopic;

    public GraduateStudent(String name, int age, int studentID, String researchTopic) {
        super(name, age, studentID);
        this.researchTopic = researchTopic;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }

}
