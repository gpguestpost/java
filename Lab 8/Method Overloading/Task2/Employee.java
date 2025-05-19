
/* @author nisar */
package Task2;

public class Employee {

    public int calculateBonus(int salary) {
        return (int) (salary * 0.10);
    }

    public int calculateBonus(int salary, int extraHours) {
        return (int) (salary * 0.10) + (500 * extraHours);
    }

}
