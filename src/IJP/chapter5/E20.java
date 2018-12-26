package ijp.chapter5;

import java.util.Scanner;

/**
 * 判断是否为素数即可
 */


public class E20 {
    public static void main(String[] args) {
        boolean flag;
        int sum;
        int count = 1;
        for (int i = 2; i <= 1000; i++) {
            sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum++;
                }
            }
            if (sum == 1) {
                System.out.printf("%d\t", i);
                if (count % 10 == 0) {
                    System.out.println();
                }
                count++;
            }
        }
    }
}
