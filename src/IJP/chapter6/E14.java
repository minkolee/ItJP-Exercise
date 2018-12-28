package ijp.chapter6;

import java.util.Scanner;

/**
 * 简单
 */

public class E14 {
    public static double calPI(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum = sum + (double) Math.pow(-1, j + 1) / (2 * j - 1);
        }
        return sum * 4;
    }

    public static void printM(int i) {
        System.out.printf("i\tm(i)\n");
        System.out.println("-------------------");
        for (int j = 1; j <= 901; j = j + 100) {
            System.out.printf("%d\t%.4f\n", j, calPI(j));
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        int i = input.nextInt();
        printM(i);
    }
}
