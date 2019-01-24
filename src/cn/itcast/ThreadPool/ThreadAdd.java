package cn.itcast.ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 多线程求和
 * 一个计算 1-100的和
 * 一个计算 1-200的和
 *
 * 步骤:
 * 1 创建线程池
 * 2 创建运行类,返回为int
 * 3 执行任务并获取返回值
 * 4 输出
 *
 */

public class ThreadAdd {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = es.submit(new ThreadAddNumber(100));
        Future<Integer> f2 = es.submit(new ThreadAddNumber(200));
        System.out.println(f1.get());
        System.out.println(f2.get());

        es.shutdown();
    }
}


class ThreadAddNumber implements Callable<Integer> {
    private int base;


    ThreadAddNumber(int i) {
        this.base = i;
    }

    private int add() {
        int sum = 0;
        for (int i = 1; i <= base;i++) {
            sum += i;
        }
        return sum;
    }

    public Integer call() {

        return add();
    }
}