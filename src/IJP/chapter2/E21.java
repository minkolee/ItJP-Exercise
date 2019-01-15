package ijp.chapter2;

import java.util.Scanner;


public class E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = input.nextDouble();
        System.out.print("Enter number of years: ");
        double year = input.nextDouble();
        double futureValue = amount * Math.pow((1 + rate / 100.0 / 12), year * 12);
        System.out.println("Accumulated value is $" + futureValue);
    }
}

