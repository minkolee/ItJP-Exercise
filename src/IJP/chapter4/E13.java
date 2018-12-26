package ijp.chapter4;

import java.util.Scanner;

/**
 * Hex to binary
 */

public class E13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String i = input.nextLine();
        char cc = i.charAt(0);
        if (cc < 'A' || (cc > 'Z' && cc < 'a') || cc > 'z') {
            System.out.println(cc + " is an invalid input");
        } else {
            switch (cc) {
                case 'A':
                case 'a':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println(cc + " is a vowel");
                    break;
                default:
                    System.out.println(cc + " is a consonant");
                    break;
            }
        }

    }
}
