package ijp.chapter3;


import java.util.Scanner;



public class E28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double ax = x1 - width1 / 2.0;
        double ay = y1 + height1 / 2.0;
        double bx = x1 + width1 / 2.0;
        double by = y1 + height1 / 2.0;
        double cx = x1 + width1 / 2.0;
        double cy = y1 - height1 / 2.0;
        double dx = x1 - width1 / 2.0;
        double dy = y1 - height1 / 2.0;

        double ax2 = x2 - width2 / 2.0;
        double ay2 = y2 + height2 / 2.0;
        double bx2 = x2 + width2 / 2.0;
        double by2 = y2 + height2 / 2.0;
        double cx2 = x2 + width2 / 2.0;
        double cy2 = y2 - height2 / 2.0;
        double dx2 = x2 - width2 / 2.0;
        double dy2 = y2 - height2 / 2.0;



    }
}

