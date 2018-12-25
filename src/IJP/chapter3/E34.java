package ijp.chapter3;


import java.util.Scanner;


public class E34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();
        double where = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        boolean inner = ((p2x <= p1x && p2x >= p0x) || ((p2x <= p0x) && (p2x >= p1x))) && ((p2y <= p1y && p2y >= p0y) || ((p2x <= p0y) && (p2x >= p1y)));
        if (where == 0 && inner) {
            System.out.println("(" + p2x + ", " + p2y + ")" + "is on the line segment from (" + p0x + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        } else {
            System.out.println("(" + p2x + ", " + p2y + ")" + "is not on the line segment from (" + p0x + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        }
    }
}