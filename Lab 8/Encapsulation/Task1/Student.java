
/* @author nisar */
package Task1_3;

public class Student {
    private String name;
    private int rollNumber;
    private char grade;
    
    public String setName(String n){
        return name = n;
    }
    
    public int setRollNumber(int r){
        return rollNumber = r;
    }
    
    public char setGrade(char g){
        return grade = g;
    }
    
    public void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: "+ rollNumber);
        System.out.println("Grade: "+ grade);
    
    }
    
}
