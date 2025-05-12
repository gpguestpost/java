/**
 * @author nisar
 */
package LAB7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text to replace 'Hello' with:");
        String user = input.nextLine();

        String text = "Hello";

        String result = text.replace("Hello", user);
        System.out.println(result);
    }
}
