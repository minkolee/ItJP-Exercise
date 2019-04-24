package lambdas.j8functional.chapter3;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * .collect(Collectors.toList()) 立即求值
 * <p>
 * 重构代码，如果要生成一个列表供使用，不如直接生成这个列表的stream供使用，非常方便操作。
 *
 * 这里还发现一个算法，如果要按位生成十进制的数字，就可以弄一个列表放着，然后每个数字乘以10加上下一个数，采用reduce即可生成。
 *
 * Java的高阶函数，就是指参数列表里包含函数接口的方法，或者方法返回一个放函数接口，这种方法都叫做高阶函数
 */

public class Sample {

    public static void main(String[] args) {

        Sample sample = new Sample();

        Stream<Integer> list = sample.genList();

        System.out.println(list);
        System.out.println("--------------------------");

        //filter，lambda表达式是一个Predict函数接口实例
//        List<Integer> newlist = list.stream().filter(x -> {
//            System.out.println("filter执行中");
//            return x > 5;
//        }).collect(Collectors.toList());

        //map， lambda表达式是一个Function<T,R>函数接口实例，可以把流中对象换成其他对象
//        如果转换了流的数据类型，一定注意接收新流的数据类型
//        List<Integer> newlist = list.stream().map(x -> x + 10).collect(Collectors.toList());
//        System.out.print("--------------------------");
//        System.out.print(newlist);
//        System.out.print(newlist.size());

        //flatmap  lambda表达式限定是返回一个Stream对象，可以把流换成另外一个流

//        List<Integer> list2 = sample.genList();
//
//        System.out.println(list2);
//        System.out.println(list2.size());
//
//        List<Integer> newlist = Stream.of(list, list2).flatMap(x -> x.stream()).collect(Collectors.toList());
//
//        System.out.println(newlist);
//        System.out.println(newlist.size());

        //max 和 min
        //参数是一个Comparator函数接口，其中唯一抽象comparing方法 int compare(T o1, T o2) ，可以传入lambda表达式。
        //用.get()拿到唯一的结果
//        int minint = list.stream().min(Comparator.comparing(x -> x + 10)).get();
//
//        System.out.print(minint);

        //reduce模式，给accumulator一个初始值，然后用这个初始值和每个元素做运算，结果再放在accumulator中，最后结accumulator就是结果。
        //用于从一组值中生成一个值,reduce直接得到结果，lambda表达式类型是BinaryOperator，就是两个操作数的操作方法，是之前介绍过几种函数式接口
        //实践中要采用类库求值，不要按照下边的手写代码
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(1);
        lists.add(1);
        lists.add(1);
        lists.add(1);
        lists.add(1);
        lists.add(1);
        lists.add(3);

        System.out.println(lists);

        int sum = list.reduce(0, (x, y) -> x * 10 + y);

        System.out.print(sum);
    }


    Stream<Integer> genList() {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random(System.currentTimeMillis());

        int i = rand.nextInt(rand.nextInt(20) + 1);

        for (int k = 0; k < i; k++) {
            list.add(rand.nextInt(10));
        }
        System.out.println("生成的列表是：" + list);


        return list.stream();
    }

}
