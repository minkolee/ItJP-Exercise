package ijp.chapter3;

import java.util.Scanner;


public class E22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double length = Math.pow(Math.pow(x1, 2) + Math.pow(x2, 2), 0.5);
        if (length <= 10.0) {
            System.out.println("Point (" + x1 + ", " + x2 + ") is in the circle");
        } else {
            System.out.println("Point (" + x1 + ", " + x2 + ") is not in the circle");
        }
    }
}

