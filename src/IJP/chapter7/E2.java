package ijp.chapter7;

import java.util.Scanner;

/**
 * 分成量个函数,
 * 1 启动输入并且返回一个数组 -- 这个方法以后可以考虑复用
 * 2 根据数组和打印结果
 */
public class E2 {
    public static void main(String[] args) {
        int[] arr = getInput();
        printResult(arr);
    }

    public static int[] getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " scores: ");
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = input.nextInt();
        }
        return arr;
    }

    public static void printResult(int[] arr) {
        if (arr.length == 0) {
            System.out.print("Array has nothing");
        } else {
            int i = arr.length - 1;
            for (; i >= 0; i--) {
                System.out.printf("%d ", arr[i]);
            }
        }

    }


}
