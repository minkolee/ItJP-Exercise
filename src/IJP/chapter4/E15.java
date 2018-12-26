package ijp.chapter4;

import java.util.Scanner;

/**
 * Hex to binary
 */

public class E15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String i = input.nextLine();
        char cc = i.charAt(0);
        if (('A' <= cc && cc <= 'C') || ('a' <= cc && cc <= 'c')) {
            System.out.println("The corresponding number is 2");
        }
        else if(('D' <= cc && cc <= 'F') || ('d' <= cc && cc <= 'f')){
            System.out.println("The corresponding number is 3");
        }
        else if(('G' <= cc && cc <= 'I') || ('g' <= cc && cc <= 'i')){
            System.out.println("The corresponding number is 4");
        }
        else if(('J' <= cc && cc <= 'L') || ('j' <= cc && cc <= 'l')){
            System.out.println("The corresponding number is 5");
        }
        else if(('M' <= cc && cc <= 'O') || ('m' <= cc && cc <= 'o')){
            System.out.println("The corresponding number is 6");
        }
        else if(('P' <= cc && cc <= 'S') || ('p' <= cc && cc <= 's')){
            System.out.println("The corresponding number is 7");
        }
        else if(('T' <= cc && cc <= 'V') || ('t' <= cc && cc<= 'v')){
            System.out.println("The corresponding number is 8");
        }
        else if(('W' <= cc && cc <= 'Z') || ('w' <= cc && cc <= 'z')){
            System.out.println("The corresponding number is 9");
        }
        else {
            System.out.println(cc + " is an invalid input");
        }
    }
}
