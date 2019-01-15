package ijp.chapter6;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a integer: ");
        int i = input.nextInt();
        displayPattern(i);
    }

    public static void displayPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (j > n - i + 1) {
                    System.out.print("\t");
                } else {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }

    }


}
