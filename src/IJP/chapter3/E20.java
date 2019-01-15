package ijp.chapter3;

import java.util.Scanner;

/**
 * 比较简单,不再写了
 */

public class E20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 sides of a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("The perimeter of this triangle is " + (a + b + c));
        } else {
            System.out.println("input is invalid.");
        }
    }
}

