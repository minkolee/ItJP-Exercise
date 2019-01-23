package cn.itcast.multiThread;

public class SubThread extends Thread {

    SubThread() {
        super();
    }

    //使用父类构造器，传线程名称
    SubThread(String s) {
        super(s);
    }

    //子类重写的run方法由虚拟机通过start()调用
    //start()只能启动一次，不能重复启动线程
    public void run() {

        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("run even..." + i);

            } else {
                System.out.println("run odd..." + i);
            }

        }
    }










}
