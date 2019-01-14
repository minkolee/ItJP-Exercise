package ijp.chapter2;

import java.util.Scanner;


public class E16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = 3 * Math.pow(3, 0.5) * Math.pow(side, 2) / 2.0;
        System.out.print("The area of the hexagon " + area);

    }
}

