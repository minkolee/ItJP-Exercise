package lambdas.j8functional.chapter3;

import cc.conyli.commons.RandomGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advance {


    //map操作的方式是，一个一个将原来的东西替换成新的

    //感觉实际上就是初始的东西也是一个List，然后每次把下一个的玩意添加进来

    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add(RandomGenerator.getRandomString(1));
        stringList.add(RandomGenerator.getRandomString(2));
        stringList.add(RandomGenerator.getRandomString(4));
        stringList.add(RandomGenerator.getRandomString(5));
        stringList.add(RandomGenerator.getRandomString(6));
        stringList.add(RandomGenerator.getRandomString(8));
        stringList.add(RandomGenerator.getRandomString(19));
        stringList.add(RandomGenerator.getRandomString(3));
        System.out.println(stringList);

        stringList.forEach(s -> System.out.println(s));
        List<String> newlist = stringList.stream().map(s -> s + "Saner").peek(s -> System.out.println(s)).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newlist);

    }


    public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
        return stream.reduce(new ArrayList<O>(), (acc, x) -> {
            List<O> newAcc = new ArrayList<>(acc);
            newAcc.add(mapper.apply(x));
            return newAcc;
        }, (List<O> left, List<O> right) -> {
            List<O> newLeft = new ArrayList<>(left);
            newLeft.addAll(right);
            return newLeft;
        });


    }
}
