package ijp.chapter2;

import java.util.Scanner;


public class E14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() * 0.45359237;
        System.out.print("Enter weight in pounds: ");
        double height = input.nextDouble() * 0.0254;
        double bmi = weight / Math.pow(height, 2);
        System.out.print("BMI is " + bmi);

    }
}

