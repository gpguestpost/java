
/*@author f24mmg5 */
package Task5;


class FullTimeEmployee extends Employee implements TaxPayer {
    
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

   
    public double calculateSalary() {
        return monthlySalary;
    }

    
    public void payTax() {
        double salary = calculateSalary();
        double tax = salary * 0.2;
        System.out.println("Full-time Employee " + name + " pays tax: $" + tax);
    }
}