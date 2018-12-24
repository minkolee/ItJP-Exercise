package ijp.chapter2;

import java.util.Scanner;


public class E6 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int lower = num % 10;
        int middle = num / 10 % 10;
        int high = num / 100;
        System.out.println("The sum of the digits is " + (lower + middle + high));
    }
}
