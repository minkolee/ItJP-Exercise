package ijp.chapter5;

import java.util.Scanner;

/**
 * 对称循环用负数循环到正数
 */


public class E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        int end = input.nextInt();
        int start;
        int j = 1;
        int i = 0;
        for (; j <= end; j++) {
            for (i = 0; i < end - j; i++) {
                System.out.print("\t");
            }
            start = -j + 1;
            for (; start < j; start++) {
                System.out.print(Math.abs(start) + 1 + "\t");
            }
            System.out.println();
        }
    }
}
