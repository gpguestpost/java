
/* @author nisar */
package LAB7;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Text: ");

        String text = input.nextLine();

        if (text.toLowerCase().contains("java")) {
            System.out.println("String contain word java");
        } else {
            System.out.println("String does not contain word java");
        }

    }
}
