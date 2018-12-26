package ijp.chapter4;

import java.util.Scanner;

/**
 *
 */

public class E19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String message = input.nextLine();
        int isbn = Integer.parseInt(message);
        int d1 = isbn / 100000000;
        int d2 = isbn % 100000000 / 10000000;
        int d3 = isbn % 10000000 / 1000000;
        int d4 = isbn % 1000000 / 100000;
        int d5 = isbn % 100000 / 10000;
        int d6 = isbn % 10000 / 1000;
        int d7 = isbn % 1000 / 100;
        int d8 = isbn % 100 / 10;
        int d9 = isbn % 10;
        int lastNumber = (d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11;
        System.out.print(d1);
        System.out.print(d2);
        System.out.print(d3);
        System.out.print(d4);
        System.out.print(d5);
        System.out.print(d6);
        System.out.print(d7);
        System.out.print(d8);
        System.out.print(d9);
        if (lastNumber == 10) {
            System.out.println("X");
        } else {
            System.out.println(lastNumber);
        }
    }
}