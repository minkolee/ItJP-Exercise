package ijp.chapter4;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double r = input.nextDouble();
        double area = (6 * Math.pow(r, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is %.2f", area);
    }
}
