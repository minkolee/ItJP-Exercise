package cn.itcast.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 */


public class TestCallable {


    public static void main(String[] args) throws Exception {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(2);

        //submit的参数是一个Runnable的实现对象
        //有几个线程就可以提交2个任务
        //超过数量,就会等待,下一个线程等一个线程
        // submit 返回一个 Future 接口的实现类
        Future<String> f1 = es.submit(new TPC());
        System.out.println(f1.get());
        Future<String> f2 = es.submit(new TPC());
        System.out.println(f2.get());
        Future<String> f3 = es.submit(new TPC());
        System.out.println(f3.get());
        Future<String> f4 = es.submit(new TPC());
        System.out.println(f4.get());



        //运行之后没有停止,说明线程回去了.所以不会结束


        // 销毁线程池,一般不用
//        es.shutdown();

        //submit还可以传Callable接口的对象
        //由于run没有返回值,所以要可以调一个东西



    }


}
