import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 集合不存储基本类型,如果要存基本类型,只能使用包装类

public class Main {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();

        array.add("Jenny");
        array.add("Cony");
        array.add("Minko");

        System.out.println(array.size());
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(0));


    }


    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("|" + a[i]);
        }
        System.out.println("|");
    }
}


