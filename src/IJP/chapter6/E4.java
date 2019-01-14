package ijp.chapter6;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        int i = input.nextInt();
        reverse(i);

    }

    public static void reverse(int number) {
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
        System.out.println(sum);
    }

}
