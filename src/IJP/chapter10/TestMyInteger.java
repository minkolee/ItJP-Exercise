package ijp.chapter10;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEConfig;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger my1 = new MyInteger(4000);
        MyInteger my2 = new MyInteger(4000);
        MyInteger my3 = new MyInteger(12);

//        System.out.println(my3.getValue());
//        System.out.println(my1.isOdd());
//        System.out.println(my3.isOdd());
//        System.out.println(my3.isPrime());

        System.out.println(MyInteger.isPrime(3500));
        System.out.println(MyInteger.parseInt("37892"));

    }
}


class MyInteger{
    private int value = 0;

    MyInteger(int a) {
        value = a;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return Math.abs(value) % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        boolean flag = true;
        if (value == 0 || Math.abs(value) == 1 || Math.abs(value) == 2) {
            flag = false;
        }

        for (int i = 2; i <= (int) Math.sqrt(Math.abs(value)); i++) {
            if (value % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isEven(int a) {
        return Math.abs(a) % 2 == 0;
    }

    public static boolean isOdd(int a) {
        return Math.abs(a) % 2 == 1;
    }

    public static boolean isPrime(int a) {
        boolean flag = true;
        if (a == 0 || Math.abs(a) == 1 || Math.abs(a) == 2) {
            flag = false;
        }

        for (int i = 2; i < (int) Math.sqrt(Math.abs(a)); i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean equals(int a) {
        return this.value == a;
    }

    public boolean equals(MyInteger a) {
        return this.value == a.value;
    }

    public static int parseInt(String a) {
        return Integer.parseInt(a);
    }

}
