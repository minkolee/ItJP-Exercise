package ijp.chapter3;


import java.util.Scanner;


public class E31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();
        double origin;
        if (convert == 0) {
            System.out.print("Enter the dollar amount: ");
            origin = input.nextDouble();
            System.out.println("$" + origin + " is " + (origin * exchangeRate) + " yuan");
        } else {
            System.out.print("Enter the RMB amount: ");
            origin = input.nextDouble();
            System.out.println(origin + " yuan is $" + (origin / exchangeRate));
        }

    }
}