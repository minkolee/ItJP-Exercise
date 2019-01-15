package cn.itcast.day18;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterable 接口
 * 有一个iterator() 方法
 * 返回一个Iterator,是一个实现了Iterable接口的实现类的对象.
 *
 * 面向接口编程
 *
 */

public class IterableDemo {
    public static void main(String[] args) {
        function();
    }



    private static void function() {
        Collection<String> array = new ArrayList<String>();
        array.add("Cony");
        array.add("Jenny");
        array.add("ffff");
        array.add("ffff2");
        Iterator<String> it = array.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        };

    }



}
