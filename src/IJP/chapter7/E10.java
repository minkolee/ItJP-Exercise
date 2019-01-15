package ijp.chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1 重载的核心是两个函数函数签名不同,就是不同的函数,而不是函数名相同
 */
public class E10 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextDouble();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(sumOfArray(arr));

    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    public static double sumOfArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

}
