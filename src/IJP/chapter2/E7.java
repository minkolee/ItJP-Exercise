package ijp.chapter2;

import java.util.Scanner;


public class E7 {
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes:");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long years = num / (365 * 24 * 60);
        long days = num % (365 * 24 * 60) / (24 * 60);
        System.out.println(num + " minutes is approximately " + years + " years and " + days + " days");
    }
}
