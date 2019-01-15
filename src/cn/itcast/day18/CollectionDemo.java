package cn.itcast.day18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口的常用方法
 * add 添加元素
 * addall 添加全部元素
 * clear 清除集合里所有元素
 * contains 这个涉及到相等操作,即如何判断相等
 * ArrayList implements List extends Collection
 */

public class CollectionDemo {

    public static void main(String[] args) {
        function_1();
    }

    // void 清空所有元素

    public static void function() {
        // 接口的多态方式
        Collection<String> array = new ArrayList<String>();
        array.add("Cony");
        array.add("Jenny");
        array.add("Minko");
        System.out.println(array); //打印出来发现是有序的

        System.out.println(array.contains("Cony"));
    }

    public static void function_1() {
        Collection<String> array = new ArrayList<String>();
        array.add("Cony");
        array.add("Jenny");
        array.add("ffff");
        array.add("ffff");
        array.remove("ffff");
        System.out.println(array); //打印出来发现是有序的


        Object[] strings = array.toArray();// toArray方法是返回一个对象数组,因为不知道是什么类型

        //集合转数组,用在IO里比较好.
        //remove 删除遇到的第一个元素,这个方法返回一个boolean,true表示成功删除,false表示删除失败,一般是找不到元素

    }
}
