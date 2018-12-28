package ijp.chapter6;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        long i = input.nextLong();
        System.out.println("Sum of digits is " + sumDigits(i));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
