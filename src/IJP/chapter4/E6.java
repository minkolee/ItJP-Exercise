package ijp.chapter4;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args){
        double RADIUS = 40.0;
        double a = Math.random() * Math.PI * 2;

        double x1 = RADIUS * Math.cos(a);
        double y1 = RADIUS * Math.sin(a);
        System.out.printf("(%.2f, %.2f)\n", x1, y1);

        a = Math.random() * Math.PI * 2;

        double x2 = RADIUS * Math.cos(a);
        double y2 = RADIUS * Math.sin(a);
        System.out.printf("(%.2f, %.2f)\n", x2, y2);
        a = Math.random() * Math.PI * 2;

        double x3 = RADIUS * Math.cos(a);
        double y3 = RADIUS * Math.sin(a);
        System.out.printf("(%.2f, %.2f)\n", x3, y3);

    }
}
