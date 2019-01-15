package ijp.chapter4;

import java.util.Scanner;

/**
 * Hex to binary
 */

public class E14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String i = input.nextLine();
        char cc = i.charAt(0);
        if (cc <= 'F' && cc >= 'A' && cc != 'E') {
            System.out.print("The numeric value for grade " + cc + " is ");
            switch (cc) {
                case 'A':
                    System.out.println("4");
                    break;
                case 'B':
                    System.out.println("3");
                    break;
                case 'C':
                    System.out.println("2");
                    break;
                case 'D':
                    System.out.println("1");
                    break;
                case 'F':
                    System.out.println("0");
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println(cc + " is an invalid grade");
        }


    }
}
