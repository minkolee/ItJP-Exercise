package ijp.chapter9;


class Rectangle {
    double width = 1.0;
    double height = 1.0;

    Rectangle() {

    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2.0 * (width + height);
    }

}


