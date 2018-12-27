package ijp.chapter7;

import java.util.Scanner;

/**
 * 1 重载的核心是两个函数函数签名不同,就是不同的函数,而不是函数名相同
 */
public class E9 {
    public static void main(String[] args) {
        double[] arr = getInput();
        double min = min(arr);
        System.out.println("The minimum number is: " + min);
    }

    public static double[] getInput() {
        Scanner input = new Scanner(System.in);
        int n = 10;
        System.out.print("Enter " + n + " numbers: ");
        double[] arr = new double[n];
        for (int j = 0; j < n; j++) {
            arr[j] = input.nextDouble();
        }
        return arr;
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
