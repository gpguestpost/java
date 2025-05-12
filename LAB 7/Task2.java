
/* @author nisar */

package LAB7;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter Text: ");

        String text = cin.nextLine();

        int index = text.indexOf("a");
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("-1");
        }

    }


}
