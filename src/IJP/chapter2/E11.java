package ijp.chapter2;

import java.util.Scanner;


public class E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int year = input.nextInt();
        int people = 312032486 + (365 * 86400 / 7 - 365 * 86400 / 13 + 365 * 86400 / 45) * year;
        System.out.println("The population in " + year + " years is " + people);
    }
}

