
class Student {

    int id;
    String name;
    double[] grades = new double[5]; 

    Student(int id, String name, double[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    void display_average_grade() {
        double sum = 0; 
        for (double grade : grades) {
            sum = sum + grade;
        }
        double average = sum / grades.length;
        System.out.println("Student " + name + " Average Grade: " + average);
    }

    double[] calc_percentage() {
        double[] percentages = new double[5];
        for (int i = 0; i < grades.length; i++) {
            percentages[i] = (grades[i] / 200) * 100;
        }
        return percentages;
    }

    String concat_id_name() {
        return id + "-" + name;
    }
    
    public static void main(String[] args) {
        double[] grades1 = {150, 180, 170, 160, 175};  
        double[] grades2 = {140, 160, 155, 145, 165};

        Student s1 = new Student(101, "Ali", grades1);
        Student s2 = new Student(102, "Sara", grades2);

        s1.display_average_grade();
        s2.display_average_grade();

        double[] percentages1 = s1.calc_percentage();
        double[] percentages2 = s2.calc_percentage();

        System.out.print("Student Ali Percentage: ");
        for (double p : percentages1) {
            System.out.print(p + "% ");
        }
        System.out.println();

        System.out.print("Student Sara Percentage: ");
        for (double p : percentages2) {
            System.out.print(p + "% ");
        }
        System.out.println();

        System.out.println("Concat ID-Name: " + s1.concat_id_name());
        System.out.println("Concat ID-Name: " + s2.concat_id_name());
    
   }    
}

