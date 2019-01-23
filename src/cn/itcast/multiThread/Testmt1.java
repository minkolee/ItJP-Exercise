package cn.itcast.multiThread;

public class Testmt1 {

    public static void main(String[] args) {
        Runnable printA = new PrintChar('a', 200);
        Runnable printB = new PrintChar('b', 200);
        Runnable printC = new PrintNum(200);
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printC);
        thread3.start();
        thread1.start();
        thread2.start();
    }
}


class PrintChar implements Runnable {
    private char charToPrint;
    private int times;


    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;

    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint + " ");
            try {

                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }

        }
    }
}

class PrintNum implements Runnable {
    private int lastNum;

    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(i);
            try {

                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println(ex);

            }
        }
    }
}


