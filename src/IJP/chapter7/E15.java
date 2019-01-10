package ijp.chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对新数组中的每一个数字判断是否存在于数组中,然后统计出重复的数字,再排序
 */
public class E15 {
    public static void main(String[] args) {
//        输入5个数字放入一个数组的代码
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        // 生成去重后的数组
        arr = eliminateDuplicates(arr);

        //排序
        Arrays.sort(arr);
        //打印数组
        System.out.print(Arrays.toString(arr));

    }

    private static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (!isInArray(list[i], temp, index)) {
                temp[index] = list[i];
                index++;
            }
        }

        int[] temp2 = new int[index];

        for (int j = 0; j < index; j++) {
            temp2[j] = temp[j];
        }
        return temp2;
    }

    private static boolean isInArray(int a, int[] arr,int index) {
        boolean isIn = false;
        for (int i = 0; i < index; i++) {
            if (a == arr[i]) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }


}
