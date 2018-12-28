package ijp.chapter9;

public class testFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);

        fan2.setSpeed(Fan.MEDIUM);
        fan2.setColor("blue");
        fan2.setOn(false);
        fan2.setRadius(5);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}

class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    Fan() {

    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return (color + " fan with radius "+ radius + " is running on level "+speed);
        } else {
            return (color + " fan with radius "+ radius + " is off");
        }
    }

}