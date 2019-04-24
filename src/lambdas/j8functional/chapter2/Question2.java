package lambdas.j8functional.chapter2;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 * 1 找到 ThreadLocal类：
 * static <S> ThreadLocal<S>  withInitial(Supplier<? extends S> supplier)
 * 用于创建一个thread local 对象，需要传入一个supplier函数接口对象，所以可以传入一个lambda表达式
 * 2 这题没有明白，就是使用Threadlocal来创建DateFormatter类吗？
 */

public class Question2 {

    //将其作为一个线程的就安全了？看来还需要看多线程编程了。。。无底洞啊

    public static final ThreadLocal<DateFormatter> FORMATTER = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

    public static void main(String[] args) {


    }


}
