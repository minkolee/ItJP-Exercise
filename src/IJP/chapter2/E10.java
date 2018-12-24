package ijp.chapter2;

import java.util.Scanner;


public class E10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");

        double amount = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initial = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double end = input.nextDouble();
        double q = amount * (end - initial) * 4184.0;
        System.out.println("The energy needed is " + q);

    }
}