
/* @author nisar */

package LAB7;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner cls = new Scanner(System.in);

        String[] array = new String[5];
        System.out.println("Enter Text\n");

        for (int i = 0; i < array.length; i++) {
            String subs = cls.nextLine();
            array[i] = subs.toUpperCase();
        }

        System.out.println("\nArranged with upper case");
        for (String str : array) {
            System.out.println(str);
        }

    }
}
