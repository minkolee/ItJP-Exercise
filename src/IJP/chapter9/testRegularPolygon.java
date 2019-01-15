package ijp.chapter9;

public class testRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("rp1's perimeter is " + rp1.getPerimeter() + " area is " + rp1.getArea());
        System.out.println("rp2's perimeter is " + rp2.getPerimeter() + " area is " + rp2.getArea());
        System.out.println("rp3's perimeter is " + rp3.getPerimeter() + " area is " + rp3.getArea());
    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    RegularPolygon() {

    }

    RegularPolygon(int n, double side) {
        if (n >= 3) {
            this.n = n;
        }
        this.side = side;
    }

    RegularPolygon(int n, double side, double x, double y) {
        if (n >= 3) {
            this.n = n;
        }
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        if (n > 3) {
            this.n = n;
        } else {
            System.out.println("Side must be at least 3, automatic set to 3");
        }
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return side * n;
    }

    public double getArea() {
        return n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n));
    }
}