package cn.itcast.day27;

/**
 * 采用同步方法解决线程问题
 * 代码量会比较少
 * 在方法声明之前加上同步关键字
 *
 * 方法里的同步锁看上去好像不用写了,其实是有锁的,就是当前对象的引用 this
 * 自己刚才竟然也无心中写了this,有了感觉了
 *
 */


public class TicketSyncMethon implements Runnable {
    private int ticket = 100;
    private Object obj = new Object();


    public void run() {
        while (true) {
            pay();
        }
    }

    private synchronized void pay() {
        // 这一块是同步代码块
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + " 出售第 " + ticket-- + " 票!");
        }
    }


}
