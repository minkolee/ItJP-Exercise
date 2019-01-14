package ijp.chapter7;

import java.util.Arrays;
import java.util.Random;

/**
 * 选择排序
 * 找到一个最小值,然后交换最小值和第一个元素的位置
 */
public class ESelectSort {
    public static void main(String[] args) {
        // 自己写的,实现的繁复了一些,实际只需要不断交换最小值就可以
//        int[] array = {4, 3, 2, 5, 5, 7, 4, 3, 2, 1};
//        int temp;
//        for (int i = 0; i < array.length; i++) {
//
//            int min = array[i];
//            int index = i;
//
//            for (int j = i + 1;j<array.length;j++ ) {
//                if (array[j] < min) {
//                    min = array[j];
//                    index = j;
//                }
//            }
//            temp = array[i];
//            array[i] = array[index];
//            array[index] = temp;
//            printArr(array);
//        }

        int[] array = {44, 32, 21, 55, 52, 71, 54, 31, 23, 12};

        bubbleSort(array);

        printArr(array);

    }


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


    //比较好的选择排序
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            printArr(array);
        }
    }

    //冒泡排序也是类似,只不过上下标要变化
    public static void bubbleSort(int[] arr) {
        //功能
        //外层循环用来控制数组循环的圈数
        for (int i = 0; i < arr.length - 1; i++) {
            //j < arr.length-1 为了避免角标越界
            //j < arr.length-1-i 为了比较效率,避免重复比较
            //内层循环用来完成元素值比较，把大的元素值互换到后面
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArr(arr);
        }
    }


}
