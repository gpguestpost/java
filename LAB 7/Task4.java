
/* @author nisar */

package LAB7;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Text: ");

        String text = input.nextLine();

        if (text.toLowerCase().startsWith("hello")) {
            System.out.println("String starts with Hello");
        } else {
            System.out.println("String does not start with Hello");
        }

    }

}
