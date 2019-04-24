package lambdas.j8functional.chapter2;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;

/**
 * 1 需要看Runnable 类：@FunctionalInterface public interface Runnable，发现是一个函数式接口
 * 有唯一抽象方法 run()，无参，返回void, lambda表达式也是无参，所以编译器可以推断出参数类型。
 * 结论：可以编译
 *
 *
 * 2 查看Interface ActionListener，虽然没有@FunctionalInterface，但是有唯一抽象方法 	actionPerformed(ActionEvent e) ，返回值是void
 *   lambda表达式有一个参数event，返回值也符合抽象方法要求，所以可以推断出event的类型是 ActionEvent
 *   结论：可以编译
 *
 * 3 无法推断，因为抽象方法不唯一，都是单参数，无法推断出x的类型
 *
 *
 *
 *
 *
 */

public class Question3 {

    //将其作为一个线程的就安全了？看来还需要看多线程编程了。。。无底洞啊

    public static final ThreadLocal<DateFormatter> FORMATTER = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

    public static void main(String[] args) {


    }


}
