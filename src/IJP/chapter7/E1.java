package ijp.chapter7;

import java.util.Scanner;

/**
 * 分成三个函数,
 * 1 是从数组中获取最大值
 * 2 启动输入并且返回一个数组 -- 这个方法以后可以考虑复用
 * 3 根据数组和最大值打印结果
 */
public class E1 {
    public static void main(String[] args) {
        int[] arr = getInput();
        printGrade(arr, getMax(arr));
    }

    public static int getMax(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int max = arr[0];
        for (int a : arr
        ) {
            if (a >= max) {
                max = a;
            }
        }
        return max;
    }

    public static int[] getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " scores: ");
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = input.nextInt();
        }
        return arr;
    }

    public static void printGrade(int[] arr, int max) {
        char c;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= (max - 10)) {
                c = 'A';
            } else if (arr[i] >= (max - 20)) {
                c = 'B';
            } else if (arr[i] >= (max - 30)) {
                c = 'C';
            } else if (arr[i] >= (max - 40)) {
                c = 'D';
            } else {
                c = 'F';
            }
            System.out.print("Student " + i + " score is " + arr[i] + " and grade is " + c + "\n");
        }
    }


}
