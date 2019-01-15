package ijp.chapter3;

import java.util.Scanner;


public class E12 {
    public static void main(String[] args) {

        System.out.print("Enter a three-digit integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number / 100 == number % 10) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}

