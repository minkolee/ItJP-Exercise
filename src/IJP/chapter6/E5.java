package ijp.chapter6;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input 3 numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        displaySortedNumbers(a, b, c);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 <= num2 && num2 <= num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else {
            System.out.println(num3 + " " + num2 + " " + num1);
        }
    }
}
