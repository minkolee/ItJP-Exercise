package ijp.chapter4;

import java.util.Scanner;

/**
 *
 */

public class E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String message = input.nextLine();
        String[] ssn = message.split("-");
        if (ssn[0].length() == 3 && ssn[1].length() == 2 && ssn[2].length() == 4) {
            System.out.println(message + " is a valid social security number");
        } else {
            System.out.println(message + " is not a valid social security number");
        }
    }
}