package ijp.chapter4;

import java.util.Scanner;

/**
 *
 */

public class E23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hour = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double taxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hour);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Gross Pay: $" + (rate * hour));
        System.out.println("Deductions: ");
        System.out.println("  Federal Withholding (20.0%): $" + (rate * hour * taxRate));
        System.out.println("  State Withholding (9.0%): $" + (rate * hour * stateTax));
        System.out.println("  Total Deduction: $" + (rate * hour * stateTax + rate * hour * taxRate));
        System.out.println("Net Pay: $" + (rate * hour - rate * hour * stateTax - rate * hour * taxRate));

    }
}