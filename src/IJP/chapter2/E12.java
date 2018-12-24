package ijp.chapter2;

import java.util.Scanner;


public class E12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = Math.pow(speed, 2) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + length);
    }
}

