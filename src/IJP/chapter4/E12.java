package ijp.chapter4;

import java.util.Scanner;

/**
 * Hex to binary
 * */

public class E12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String i = input.nextLine();
        char cc = i.charAt(0);
        System.out.print("The binary value is ");
        switch (cc){
            case 'A':
            case 'a':
                System.out.println("1010");
                break;
            case 'B':
            case 'b':
                System.out.println("1011");
                break;
            case 'C':
            case 'c':
                System.out.println("1100");
                break;
            case 'D':
            case 'd':
                System.out.println("1101");
                break;
            case 'E':
            case 'e':
                System.out.println("1110");
                break;
            case 'F':
            case 'f':
                System.out.println("1111");
                break;
            default:
                System.out.println("Out of range");
                break;
        }
    }
}
