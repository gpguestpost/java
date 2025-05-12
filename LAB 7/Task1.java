
/* @author nisar */
package LAB7;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter Text: ");

        String text = cin.nextLine();

        if (text.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");

        }

    }

}
