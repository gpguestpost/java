package Task2;

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
