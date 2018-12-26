package ijp.chapter4;

import java.util.Scanner;

/**
 *
 */

public class E20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String message = input.nextLine();
        char first = message.charAt(0);
        System.out.println("The string is " + message.length() + " long and the first character is " + first);

    }
}