
/* @author nisar */
package Task2_3;

public class Temperature {
    
    private double celsius;
    
    public double setCelsius(double c){
        return celsius = c;
    }
    
    public double getFahrenheit(){
        return celsius * 9/5 + 32;
    
    }
}
