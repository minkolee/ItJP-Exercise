import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 集合不存储基本类型,如果要存基本类型,只能使用包装类

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];

        array[0] = 6;
        array[1] = 6;

        System.out.println(array.length);

        printArr(array);
    }




    // 这个函数略加修改就能够改成toString()方法来使用
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


