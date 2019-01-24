package cn.itcast.ThreadPool;

import java.util.concurrent.Callable;

/**
 * 接口 实现类
 */

public class TPC implements Callable<String> {

    public String call() {
        return "This is " + Thread.currentThread().getName();
    }

}
