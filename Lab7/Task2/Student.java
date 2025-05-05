package Task2;

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
