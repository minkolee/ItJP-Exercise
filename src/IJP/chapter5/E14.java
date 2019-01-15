package ijp.chapter5;

import java.util.Scanner;


public class E14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input 2 integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int d = n1 >= n2 ? n2 : n1;

        for (; d >= 1; d--) {
            if (n1 % d == 0 && n2 % d == 0) {
                System.out.printf("The gcd of %d and %d is %d", n1, n2, d);
                break;
            }
        }
    }
}
