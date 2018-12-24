package ijp.chapter2;

import java.util.Scanner;


public class E5 {
    public static void main(String[] args) {
        System.out.print("Enter the subtotal and a gratuity rate:");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble() / 100;
        System.out.println("The gratuity is $" + subtotal * gratuity + " and total is $" + (subtotal + subtotal * gratuity));
    }
}
