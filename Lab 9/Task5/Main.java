
/* @author f24mmg5 */
package Task5;

public class Main {
    public static void main(String[] args) {
 
        FullTimeEmployee ftEmployee = new FullTimeEmployee("Nisar",101, 5000);
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Bob", 102, 80, 20.00);
       
        System.out.println("Full-time Salary: $" + ftEmployee.calculateSalary());
        ftEmployee.payTax();
        
        System.out.println();
        
        System.out.println("Part-time Salary: $" + ptEmployee.calculateSalary());
        ptEmployee.payTax();
    }
}
