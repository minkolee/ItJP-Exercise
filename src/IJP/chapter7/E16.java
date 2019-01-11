package ijp.chapter7;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 分成几个方法
 * 第一个方法填充数组
 */
public class E16 {
    public static void main(String[] args) {
        //生成100000大小的数组
        int[] array = genArray(1000000);
        //生成要查找的数字
        Random rand = new Random();
        int key = rand.nextInt(1000000);
        System.out.println("The key is " + key);

        //测试运行时间
        long startTime = System.currentTimeMillis();
        System.out.println("Start time is " + startTime);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Found, position is " + i);
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("End time is " + endTime);

        System.out.println("Elasped time is " + (endTime - startTime));

        System.out.println("-------------------------------------------------------------------------------");

        //使用二分查找
        int low = 0;
        int high = array.length - 1;

        Arrays.sort(array);


        startTime = System.currentTimeMillis();
        System.out.println("Start time is " + startTime);

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                System.out.println("Found, position is " + mid);
                break;
            } else {
                low = mid + 1;
            }
        }


        endTime = System.currentTimeMillis();
        System.out.println("End time is " + endTime);

        System.out.println("Elasped time is " + (endTime - startTime));


    }


    // 填充数组的方法
    private static int[] genArray(int length) {
        Random rand = new Random();
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = rand.nextInt(100000);
        }
        return temp;
    }

    //打印数组的方法
    public static void printArr(int[] a) {
        System.out.print('[');
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(',');
            }
        }
        System.out.println(']');
    }
}
