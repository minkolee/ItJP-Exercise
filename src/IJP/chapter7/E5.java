package ijp.chapter7;

import java.util.Scanner;

/**
 * 分成2个函数,
 * 1 去掉重复的数字有点问题
 * 2 根据数组和打印结果
 */
public class E5 {
    public static void main(String[] args) {
        int[] arr = getInput();
        printResult(arr);
    }

    public static int[] getInput() {
        Scanner input = new Scanner(System.in);
        int n = 10;
        System.out.print("Enter " + n + " scores: ");
        int[] arr = new int[n];
        int temp;
        for (int j = 0; j < n; j++) {
            temp = input.nextInt();
            boolean flag = false;

            for (int i = 0; i < j; i++) {
                if (temp == arr[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                arr[j] = temp;
            }

        }
        return arr;
    }

    public static void printResult(int[] arr) {
        System.out.printf("The distinct numbers are: ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.printf("%d ", arr[i]);
                count++;
            } else {
                System.out.printf("");
            }
        }
        System.out.println();
        System.out.printf("The number of distinct number is %d\n", count);

    }

    public static void printNormalArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

}
