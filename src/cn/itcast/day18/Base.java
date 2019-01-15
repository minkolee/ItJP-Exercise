package cn.itcast.day18;

import java.util.ArrayList;

/**
 * 集合的关键是:可变长,存储引用类型(也就是非基本类型)
 * 如果支持基本类型,那么装入的时候会自动装箱
 * 先看一个已经使用过的 ArrayList
 *
 *
 * 有很多集合,需要看看大概分为哪些类,也就是各种集合的结构
 * 注意
 * 1 数据的增删改查,也就是存取
 * 2 还要注意容器本身的特性会产生什么影响
 * 然后根据实际情况选择适合的集合
 *
 * Collection 有两个继承类 List列表 和 Set集
 * List下边有两个:ArrayList 和 LinkedList
 * Set下边有HashSet和LinkedHashSet
 * 这两个家族的存储机制不同
 * 所有的Java标准库集合都在java.util中
 *
 *
 * List 派系的,可以存储重复的,而且都是有序的
 * Set 派系的,不能存重复的,是无序的.
 *
 * 所以先学习Collection接口
 */

public class Base {
    public static void main(String[] args) {


        ArrayList<Integer> array = new ArrayList<>();

        array.add(11);
        array.add(12);
        array.add(14);
        array.add(15);
        array.add(52);

        for (Integer e:array
             ) {
            System.out.println(e);
        }


    }
}
