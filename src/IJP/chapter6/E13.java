package ijp.chapter6;

import java.util.Scanner;

/**
 * 简单
 */

public class E13 {
    public static double calM(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum = sum + (double) j / (j + 1);
        }
        return sum;
    }

    public static void printM(int i) {
        System.out.printf("i\tm(i)\n");
        System.out.println("-------------------");
        for (int j = 1; j <= i; j++) {
            System.out.printf("%d\t%.4f\n", j, calM(j));
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        int i = input.nextInt();
        printM(i);
    }
}
