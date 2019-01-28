package Wake;
/**
 * 实现的方案之一,通过一个共同的锁对象来锁住共享操作区域,这样的结果一定是没问题的
 * 但是问题在于,现在没有实现交替打印,线程依然在抢资源,没有达到目的,因此必须让两个线程协同工作
 *
 */


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainWake {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Resource re = new Resource();

        InputT inn = new InputT(re,lock);
        OutputT outt = new OutputT(re, lock);

        Thread t1 = new Thread(inn);
        Thread t2 = new Thread(outt);

        t1.start();




        t2.start();




    }
}
