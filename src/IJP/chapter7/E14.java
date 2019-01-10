package ijp.chapter7;

import java.util.Random;
import java.util.Scanner;

/**
 * 由于不知道算法,就采取暴力方案,即从数组里最大值的一半起算,一直算到1,哪一个能够全部整除就是最大公约数
 * 为此分离两个方法
 * 一个方法是从int数组中取最大值
 *
 * 采用一个和数组长度一样的bool数组追踪每次的判断结果,全部为true才说明成功找到,每次循环结束之后将bool数组全部设置为false.
 * 一个方法是判断循环之后一个bool数组是否都是true
 */
public class E14 {
    public static void main(String[] args) {
//        输入5个数字放入一个数组的代码
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print(gcd(arr));

    }

    public static int gcd(int... numbers) {
        boolean[] isTrue = new boolean[numbers.length];

        for (int i = getMax(numbers) / 2; i >= 1; i--) {
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[k] % i == 0) {
                    isTrue[k] = true;
                }
            }

            if (isALlTrue(isTrue)) {
                return i;
            } else {
                for (int j = 0; j < isTrue.length; j++) {
                    isTrue[j] =false;
                }
            }
        }
        return 1;
    }

    public static int getMax(int... numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static boolean isALlTrue(boolean[] bools) {
        int sum = 0;
        for (boolean e : bools) {
            if (e == true) {
                sum++;
            }
        }

        if (sum == bools.length) {
            return true;
        } else {
            return false;
        }
    }


}
