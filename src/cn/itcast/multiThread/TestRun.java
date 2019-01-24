package cn.itcast.multiThread;

public class TestRun {
    public static void main(String[] args) throws Exception {
        Thread st = new Thread(new RunnableImp());
        Thread st2 = new Thread(new RunnableImp());


        st.start();
        st2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main is ..." + i);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(10);
        }
    }
}
