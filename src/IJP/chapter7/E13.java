package ijp.chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 分离判断一个整数是否在数组内的方法,然后用一个do while循环即可
 */
public class E13 {
    public static void main(String[] args) {
        // 输入10个数字放入一个数组的代码
//        double[] arr = new double[10];
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter ten numbers: ");
//        for (int i = 0; i < 10; i++) {
//            arr[i] = input.nextDouble();
        int[] arr = {1, 2, 20, 21, 22, 43, 44, 45};
//        }
//主体部分
        System.out.println(getRandom(arr));
    }

    public static int getRandom(int... numbers) {
        Random rand = new Random();
        int result;
        do {
            result = rand.nextInt(54) + 1;
        } while (isInArray(result, numbers));
        return result;
    }

    public static boolean isInArray(int a, int[] arr) {
        boolean isIn = false;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }

}
