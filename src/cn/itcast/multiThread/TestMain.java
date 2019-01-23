package cn.itcast.multiThread;

/**
 * 如何创建和启动线程
 * 1 创建Thread对象
 * 2 使用.start()启动新线程的任务
 * 3 使用sleep 睡，注意，毫秒未必是精确的睡那么久，与系统实际的调度时间有关
 * 栈内存
 */

public class TestMain {

    public static void main(String[] args) {
//        // new Thread或者Thread的子类就是新建一个线程
//        SubThread st = new SubThread();
//
//        // 启动线程的任务
//        st.start();
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("main even..." + i);
//
//            } else {
//                System.out.println("main odd..." + i);
//            }
//        }
        for (int i = 0; i < 100; i++) {
            NameThread nt = new NameThread();
            nt.start();
        }
    }
}
