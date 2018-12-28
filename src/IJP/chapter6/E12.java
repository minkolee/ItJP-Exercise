package ijp.chapter6;

import java.util.Scanner;

/**
 * 采用char类型操作符来简便写.输入当做一行字符串来分解
 */

public class E12 {
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        char small = ch1 >= ch2 ? ch2 : ch1;
        char big = ch1 == small ? ch2 : ch1;
        int i = (int) (big - small);
        for (int j = 0; j < i + 1; j++) {
            System.out.print((char)(small + j) + " ");

            if ((j + 1) % numberPerLine == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input 2 char and 1 number: ");
        String[] message = input.nextLine().split(" ");
        char a = message[0].charAt(0);
        char b = message[1].charAt(0);
        int n = Integer.parseInt(message[2]);
        printChars(a, b, n);
    }
}
