package cn.itcast.multiThread;

public class NameThread extends Thread {


    public void run() {
        System.out.println(Thread.currentThread().getName());
    }


}
