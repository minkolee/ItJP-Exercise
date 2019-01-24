package cn.itcast.ThreadPool;

/**
 * Runnable类 就是 将线程的任务和启动线程分开
 * 将Runnable类的实例作为线程对象的参数
 *
 * run方法由于父类方法不抛异常，子类也不能抛
 * 如果使用静态方法sleep，就必须处理异常
 *
 */

public class RunnableImp implements Runnable {

    public void run()  {
        System.out.println("---------------" + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println("This is runnable ..." + i);
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(30);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
