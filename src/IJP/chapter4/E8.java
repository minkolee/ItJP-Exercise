package ijp.chapter4;

import java.util.Scanner;

/**
 * 本体忽略，又是算数学
 */

public class E8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        short code = input.nextShort();
        char cc = (char) code;
        System.out.println("The character for ASCII code 69 is " + cc);
    }
}
