package ijp.chapter3;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your package's weight: ");
        double result = input.nextDouble();
        if (result > 20) {
            System.out.println("The package cannot be shipped");
        } else if (result > 10) {
            System.out.println("Price is 10.5");
        } else if (result > 3) {
            System.out.println("Price is 8.5");
        } else if (result > 1) {
            System.out.println("Price is 5.5");
        } else if (result > 0) {
            System.out.println("Price is 3.5");
        } else {
            System.out.println("Pay me.");
        }
    }
}

