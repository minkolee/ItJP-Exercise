import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};


        int i = -3;
        printArr(arr);
    }


    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("|" + a[i]);
        }
        System.out.println("|");
    }
}


