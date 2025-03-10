class Employee {

    String name;
    int empID;
    double salary;


    Employee(String Empname, int id, double Empsalary) {
        name = Empname;
        empID = id;
        salary = Empsalary;
    }

    void increaseSalary(double amount) {
        salary = salary + amount;
        System.out.println("Salary increased by " + amount);
    }

    void calculateAnnualSalary() {
        System.out.println("Annual Salary: " + salary * 12);
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
    }
    

    public static void main(String args[]) {

        Employee e1 = new Employee("Ali Jaan", 101, 5000);

        e1.increaseSalary(2000);

        e1.displayDetails();

        e1.calculateAnnualSalary();
    }
}

