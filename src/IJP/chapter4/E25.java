package ijp.chapter4;

import java.util.Scanner;

/**
 *
 */

public class E25 {
    public static void main(String[] args) {
        char d1 = (char) ((Math.random() * 26) + 65);
        char d2 = (char) ((Math.random() * 26) + 65);
        char d3 = (char) ((Math.random() * 26) + 65);
        int d4 = (int) (Math.random() * 10);
        int d5 = (int) (Math.random() * 10);
        int d6 = (int) (Math.random() * 10);
        int d7 = (int) (Math.random() * 10);
        System.out.print(d1);
        System.out.print(d2);
        System.out.print(d3);
        System.out.print(d4);
        System.out.print(d5);
        System.out.print(d6);
        System.out.println(d7);
    }
}