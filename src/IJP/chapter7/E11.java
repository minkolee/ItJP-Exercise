package ijp.chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 将不同功能分开到各个静态方法里
 */
public class E11 {
    public static void main(String[] args) {
        // 输入10个数字放入一个数组的代码
        double[] arr = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextDouble();
        }


        //主体部分


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

    public static double mean(double[] array) {
        return sumOfArray(array) / array.length;
    }
}
