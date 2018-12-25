package ijp.chapter3;


import java.util.Scanner;

/**
 * @author Minko
 * 算法是:
 * 首先将p 限制在 (0,0), (200,100)这个矩形内.
 * 然后计算p 和(200,0)这个点的斜率的绝对值,如果大于1/2就不在三角形内
 */

public class E27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean step1 = !(x > 200.0 || x < 0 || y > 100.0 || y < 0);
        boolean step2 = (Math.abs(y) / Math.abs(x - 200.0)) < 0.5;

        if (step1 && step2) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}

