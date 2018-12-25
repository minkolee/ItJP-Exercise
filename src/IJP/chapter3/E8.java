package ijp.chapter3;

import java.util.Scanner;


public class E8 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter 3 integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a >= b && b >= c) {
            System.out.println(c + " " + b + " " + a);
        }
        if (a >= c && c >= b) {
            System.out.println(b + " " + c + " " + a);
        }
        if (b >= c && c >= a) {
            System.out.println(a + " " + c + " " + b);
        }
        if (b >= a && a >= c) {
            System.out.println(c + " " + a + " " + b);
        }
        if (c >= a && a >= b) {
            System.out.println(b + " " + a + " " + c);
        }
        if (c >= b && b >= a) {
            System.out.println(a + " " + b + " " + c);
        }
    }
}