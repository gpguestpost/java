
/* @author nisar */
package LAB7;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String words = input.nextLine();

        String[] array = words.split(" ");
        for (String word : array) {
            System.out.println(word);
        }
        System.out.println("Total words: " + array.length);

    }

}
