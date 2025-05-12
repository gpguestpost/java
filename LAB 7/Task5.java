
/* @author nisar */
package LAB7;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Text: ");

        String text = input.nextLine();

        if (text.toLowerCase().endsWith("world")) {
            System.out.println("String ends with world");
        } else {
            System.out.println("String does not end with world");
        }
    }
}
