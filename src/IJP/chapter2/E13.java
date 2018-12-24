package ijp.chapter2;

import java.util.Scanner;


public class E13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthMount = input.nextDouble();
        double rate = 0.00417;
        double finalAmount = monthMount * Math.pow((1 + 0.00417), 6) +
                monthMount * Math.pow((1 + 0.00417), 5) +
                monthMount * Math.pow((1 + 0.00417), 4) +
                monthMount * Math.pow((1 + 0.00417), 3) +
                monthMount * Math.pow((1 + 0.00417), 2) +
                monthMount * Math.pow((1 + 0.00417), 1);
        System.out.print("After the sixth month, the account value is $" + finalAmount);

    }
}

