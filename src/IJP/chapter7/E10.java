package ijp.chapter7;

import java.util.Scanner;

/**
 * 1 重载的核心是两个函数函数签名不同,就是不同的函数,而不是函数名相同
 */
public class E10 {
    public static void main(String[] args) {
        int[] arr = E2.getInput();
        int index = indexOfMin(arr);
        System.out.println("The index is: " + index);
    }

    public static int[] getInput() {
        Scanner input = new Scanner(System.in);
        int n = 10;
        System.out.print("Enter " + n + " numbers: ");
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = input.nextInt();
        }
        return arr;
    }

    public static int indexOfMin(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }


    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        return min;
    }

}
