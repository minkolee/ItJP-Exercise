package cn.itcast.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 * Executors 类的名字就说明了本质上一个线程就是一个执行单元,一个干活的工人
 * <p>
 * <p>
 * 在 java.util.concurrent 内,几乎都是静态方法.
 * <p>
 * newFixedThreadPool(int nThreads) 创建固定数量的线程池. 返回static ExecutorService
 * 说明ExecutorService 是线程池对象
 * 实际上ExecutorService是一个接口,相当于父类,有三个实现类 AbstractExecutorService, ScheduledThreadPoolExecutor, ThreadPoolExecutor
 * <p>
 * 先不用管这么多,这个接口有个方法submit,用于提交执行任务,是泛型方法
 */


public class TestPool {


    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(2);

        //submit的参数是一个Runnable的实现对象
        //有几个线程就可以提交2个任务
        //超过数量,就会等待,下一个线程等一个线程
        es.submit(new RunnableImp());
        es.submit(new RunnableImp());
        es.submit(new RunnableImp());

        //运行之后没有停止,说明线程回去了.所以不会结束


        // 销毁线程池,一般不用
//        es.shutdown();

        //submit还可以传Callable接口的对象
        //由于run没有返回值,所以要可以调一个东西



    }


}
