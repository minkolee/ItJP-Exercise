package ijp.chapter5;

import java.util.Scanner;

/**
 * 算法是用整数从2开始不断整除，直到自己变成1，如果能整除，就将整数更新为最新值，然后将start重置为2，如果不能整除，就把start 增加1
 */


public class E16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        int i = input.nextInt();
        int start = 2;
        while (i != 1) {
            if (i % start == 0) {
                System.out.print(start + " ");
                i = i / start;
                start = 2;
            } else {
                start++;
            }
        }
    }
}
