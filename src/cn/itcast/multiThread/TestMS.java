package cn.itcast.multiThread;

public class TestMS {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        SubThread st = new SubThread("776");

        st.start();
    }
}
