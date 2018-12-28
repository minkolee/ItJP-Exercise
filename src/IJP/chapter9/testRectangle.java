package ijp.chapter9;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        Rectangle r3 = new Rectangle();

        System.out.printf("R1's width is %f, height is %f, area is %f, perimeter is %f\n", r1.width, r1.height, r1.getArea(), r1.getPerimeter());
        System.out.printf("R2's width is %f, height is %f, area is %f, perimeter is %f\n", r2.width, r2.height, r2.getArea(), r2.getPerimeter());
        System.out.printf("R3's width is %f, height is %f, area is %f, perimeter is %f\n", r3.width, r3.height, r3.getArea(), r3.getPerimeter());
    }
}
