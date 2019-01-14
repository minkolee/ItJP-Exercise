package ijp.chapter5;

import java.util.Scanner;

/**
 * 仔细观察,每一行的幂 为 -(n-1) 到 (n-1) 的循环,可以采取类似17题的方法
 */


public class E19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        int lines = input.nextInt();
        int i = 0;

        for (i = 1; i <= lines; i++) {
            for (int j = 0; j < lines - i; j++) {
                System.out.printf("\t");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("%-3d\t", (int) Math.pow(2, k));
            }
            ;
            for (int l = i - 1; l >= 1; l--) {
                System.out.printf("%-3d\t", (int) Math.pow(2, l - 1));
            }
            System.out.println();
        }
    }
}
