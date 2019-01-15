package ijp.chapter3;

import java.util.Scanner;


public class E23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x > 5.0 || x < -5.0 || y > 2.5 || y < 2.5) {
            System.out.println("Point (" + x + ", " + x + ") is not in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + x + ") is in the rectangle");

        }
    }
}

