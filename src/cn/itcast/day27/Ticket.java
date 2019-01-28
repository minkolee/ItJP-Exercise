package cn.itcast.day27;

/**
 * synchronized (对象 不能是匿名对象){
 * 其中是同步代码块
 * }
 *
 * 括号里的对象,叫做同步锁,专业词语叫做对象监视器
 * lang包里有个异常IllegalMonitorStateException 就是无效监视器异常
 * 这个锁做的事情就是,没有锁的线程不能执行,只能等待
 *
 *
 * 注意,多线程,必须使用同一个锁对象才行
 * 如果用了匿名new 对象,那每个人都有不同的锁,等于没有锁
 *
 *
 */


public class Ticket implements Runnable {
    private int ticket = 100;
    private Object obj = new Object();

    public void run() {
        while (true) {
            synchronized (obj) {
                // 这一块是同步代码块
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " 出售第 " + ticket-- + " 票!");
                }
            }
        }
    }
}
