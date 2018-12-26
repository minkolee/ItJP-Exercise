package ijp.chapter4;

import java.util.Scanner;

/**
 *
 */

public class E24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String first = input.nextLine();
        System.out.print("Enter the second city: ");
        String second = input.nextLine();
        System.out.print("Enter the third city: ");
        String third = input.nextLine();
        if (first.compareTo(second) <= 0 && second.compareTo(third) <= 0) {
            System.out.println("The three cities in alphabetical order are " + first + " " + second + " " + third);
        } else if (first.compareTo(third) <= 0 && third.compareTo(second) <= 0) {
            System.out.println("The three cities in alphabetical order are " + first + " " + third + " " + second);
        } else if (second.compareTo(first) <= 0 && first.compareTo(third) <= 0) {
            System.out.println("The three cities in alphabetical order are " + second + " " + first + " " + third);
        } else if (second.compareTo(third) <= 0 && third.compareTo(first) <= 0) {
            System.out.println("The three cities in alphabetical order are " + second + " " + third + " " + first);
        } else if (third.compareTo(first) <= 0 && first.compareTo(second) <= 0) {
            System.out.println("The three cities in alphabetical order are " + third + " " + first + " " + second);
        } else {
            System.out.println("The three cities in alphabetical order are " + third + " " + second + " " + first);
        }
    }
}