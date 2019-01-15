package ijp.chapter9;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;
import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class testQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation qe1 = new QuadraticEquation(a, b, c);

        if (qe1.getDiscriminant() < 0) {
            System.out.println("The equation has no root");
        } else if (qe1.getDiscriminant() == 0) {
            System.out.println("The equation has two same roots: " + qe1.getRoo1());
        } else {
            System.out.println("The equation has two roots: " + qe1.getRoo1() + " and " + qe1.getRoo2());
        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoo1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        }
    }

    public double getRoo2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        }
    }
}