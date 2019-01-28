package Wake2.Wake;
/**
 * 实现的方案之二,通过线程间相互唤醒来控制线程的具体工作方式,否则线程是不能操作的,只会拼命执行
 *
 *
 * 这里的核心是
 * 1 锁对象才能调用 wait()和 notify()
 * 2 必须要在同一个对象监视器,也就是锁上调用方法才有效
 * 3 可见监视器会成为一批线程的监视器
 */


public class MainWake {

    public static void main(String[] args) {

        Resource re = new Resource();

        InputT inn = new InputT(re);
        OutputT outt = new OutputT(re);

        Thread t1 = new Thread(inn);
        Thread t2 = new Thread(outt);

        //先启动赋值线程,待线程完成第一次工作之后,启动第二个线程,之后自己等待第二个线程
        t1.start();


        //被启动之后,首先等待第一个线程,完成工作之后,唤醒第二个线程,然后自己等待第一个线程
        t2.start();




    }
}
