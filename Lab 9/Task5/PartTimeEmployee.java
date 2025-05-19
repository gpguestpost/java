/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task5;

/* @author f24mmg5 */
class PartTimeEmployee extends Employee implements TaxPayer {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
 
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void payTax() {
        double salary = calculateSalary();
        double tax = salary * 0.1;
        System.out.println("Part-time Employee " + name + " pays tax: $" + tax);
    }
}
