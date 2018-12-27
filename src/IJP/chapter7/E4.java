package ijp.chapter7;

import java.util.Scanner;

/**
 * 分成2个函数,
 * 1 启动输入并且返回一个数组,以 0结束.采取字符串的方法,计算长度并且返回一个数组. 这个也可以复用
 * 2 根据数组和打印结果
 */
public class E4 {
    public static void main(String[] args) {
        int[] arr = getInputEnds0();
        int[] result = getResult(arr);
        System.out.printf("%d lower than avg\n",result[0]);
        System.out.printf("%d no less than avg\n",result[1]);
    }

    public static int[] getInputEnds0() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100, ends with 0: ");
        String[] message = input.nextLine().split(" ");
        // 找到0的位置,确定int数组的长度
        int i;
        for (i = 0; i < message.length; i++) {
            if (Integer.parseInt(message[i])<0) {
                break;
            }
        }
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = Integer.parseInt(message[j]);
        }
        return arr;
    }

    public static void printNormalArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void printResult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                System.out.printf("%d occurs %d ",i+1,arr[i]);
                if (arr[i] > 1) {
                    System.out.println("times");
                } else {
                    System.out.println("time");
                }
            }
        }
    }

    public static int[] countNumbersInArray(int[] arr) {
        int[] temp = new int[100];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]-1]++;
        }
        return temp;
    }

    public static int[] getResult(int[] arr) {
        int count = 0;
        int lower = 0;
        int upper = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 100) {
                sum += arr[i];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("Avg score is " + avg);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= avg) {
                upper++;
            } else {
                lower++;
            }
        }
        int[] temp = new int[2];
        temp[0] = lower;
        temp[1] = upper;
        return temp;
    }

}
