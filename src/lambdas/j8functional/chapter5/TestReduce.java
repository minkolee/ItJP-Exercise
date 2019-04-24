package lambdas.j8functional.chapter5;

import cc.conyli.commons.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestReduce {


    public static void main(String[] args) {

        List<Integer> list = RandomGenerator.getRandomList(10, 20);

        List<String> stringList = RandomGenerator.getRandomStringList(10, 5);

        stringList.addAll(RandomGenerator.getRandomStringList(5, 3));

        System.out.println(stringList);

//        System.out.println(list);


        //Test 1 把两个数相减
//        Optional<Integer> optional = list.stream().reduce((left, right) -> {
//            return 0;
//        });
//
//        System.out.println(optional.orElse(-1));


        //Test 2 把字符串弄到一起

//        StringBuilder s = stringList.stream().reduce(new StringBuilder(), (x, y) -> {
//            x.append(y);
//            return x;
//        }, (left, right) -> left.append(right));

//        System.out.println(s.toString());


//        搞明白了，如果reduce使用两参数的方法
//        第二个参数的lambda表达式的类型是BinaryOperator，这是一个特殊的BinaryOperator<T> extends BiFunction<T,T,T>，两个参数和返回类型全相等。
//        所以用两参数的reduce，开始值的类型必须和流中元素类型相同。
//
//        三参数的reduce方法的lambda类型就是标准的BiFunction<T, U, R> ，可以返回不同的类型，更加灵活，如果不并行的话，第三个参数的lambda表达式随便写都可以。因为不会执行
        ArrayList<String> s = stringList.stream().reduce(new ArrayList<String>(), (x, y) -> {
            if (y.length() > 3) {
                x.add(y);

            }
            return x;
        }, (x, y) -> x);



    }
}
