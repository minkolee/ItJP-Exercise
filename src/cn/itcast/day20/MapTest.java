package cn.itcast.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * collection 和 map 是无关的两个接口,所以集合分为两大类,一个是collection衍生的单列集合,一个是map衍生的双列集合
 * 存储重复键的时候,put方法返回被覆盖的值
 * get 方法如果找不到键,就返回null,否则返回取到的值
 */

public class MapTest {

    public static void main(String[] args) {
        func();
    }

    public static void func() {
        Map<String, Integer> map = new HashMap<>();

        map.put("a",3);
        map.put("b",5);
        map.put("c",1);
        map.put("d",4);
        int i = map.put("a", 66);

        System.out.println(i);
        System.out.println(map.get("C"));


        // 删除如果成功返回对应的值,不成功则返回null
//        int j = map.remove("d");
//        System.out.println(j);
//        System.out.println(map.size());

        //Map不能直接遍历
        //遍历Map,使用全部的键
        //通过keySet返回集合的键

        Set<String> sets = map.keySet();
        System.out.println(sets);
        for (String key : sets) {
            System.out.println(map.get(key));

        }

        // 使用.getClass()得到具体是哪个类型
        //可以发现这个 set是HashMap的一个内部类
        System.out.println(sets.getClass());

        //还一个方法使用entrySet
        //这个泛型类是Map.Entry<String,Integer>,与映射类型要匹配
        Set<Map.Entry<String,Integer>> sets2 = map.entrySet();
        System.out.println(sets2);
        for (Map.Entry ob : sets2) {
            System.out.println(ob.getKey());
            System.out.println(ob.getValue());
        }

        //HashMap线程不安全,快
        //HashTable线程安全,和Vector一样都是线程安全的,所以在JDK 1.2之后逐渐被取代
        //HashMap允许存储null值,null键
        //HashTable不允许存储null值和null键
        //Hashtable的子类 Properties依然还活跃在开发端
    }

}
