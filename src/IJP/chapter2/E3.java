package ijp.chapter2;

import java.util.Scanner;


public class E3 {
    public static void main(String[] args) {
        System.out.print("Enter a value for feet:");
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is "+meters+" meters");
    }
}
