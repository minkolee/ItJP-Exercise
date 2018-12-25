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

//        System.out.println(ax);
//        System.out.println(ay);
//        System.out.println(bx);
//        System.out.println(by);
//        System.out.println(cx);
//        System.out.println(cy);
//        System.out.println(dx);
//        System.out.println(dy);
//        System.out.println("------");
//        System.out.println(ax2);
//        System.out.println(ay2);
//        System.out.println(bx2);
//        System.out.println(by2);
//        System.out.println(cx2);
//        System.out.println(cy2);
//        System.out.println(dx2);
//        System.out.println(dy2);


        if (ax2 < ax || ay2 > ay || bx2 > bx || by2 > by || cx2 > cx || cy2 < cy || dx2 < dx || dy2 < dy) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 is inside r1");
        //  还需要再加一层判断，是否完全不在内部和在内部
        }

    }
}

