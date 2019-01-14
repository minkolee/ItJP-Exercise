package ijp.chapter6;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        int i = input.nextInt();
        System.out.println(reverse(i));
        if (isPalindrome(i)) {
            System.out.println("The integer " + i + " is palindrome.");
        } else {
            System.out.println("The integer " + i + " is not palindrome.");
        }

    }

    public static int reverse(int number) {
        int sum = 0;
        int i = 0;
        int temp = number;
        while (temp != 0) {
            temp = temp / 10;
            i++;
        }

        while (number != 0) {
            sum = sum + (int) Math.pow(10, i - 1) * (number % 10);
            number = number / 10;
            i--;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

}
