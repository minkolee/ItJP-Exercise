package ijp.chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 直接操作传入的引用变量即可
 */
public class E12 {
    public static void main(String[] args) {
        // 输入10个数字放入一个数组的代码
        double[] arr = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextDouble();
        }


        //主体部分
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(arr));

    }

    public static double[] reverse(double[] array) {
        int i = 0;
        int k = array.length - 1;
        double temp;
        while (i < k) {
            temp = array[i];
            array[i] = array[k];
            array[k] = temp;
            i++;
            k--;
        }
        return array;
    }

}
