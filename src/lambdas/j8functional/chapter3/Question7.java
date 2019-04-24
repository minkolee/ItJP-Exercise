package lambdas.j8functional.chapter3;

import cc.conyli.commons.RandomGenerator;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 字符串的chars()方法可以产生一个流，基于流来计算落在小写字母之间的范围
 */


public class Question7 {



    public static void main(String[] args) {

        //思路
        //先把字符串做成一个Map流，然后从其中选出最小的长度对应的字符串

        List<String> stringList = new ArrayList<>();
        stringList.add(RandomGenerator.getRandomString(3));
        stringList.add(RandomGenerator.getRandomString(5));
        stringList.add(RandomGenerator.getRandomString(4));
        stringList.add(RandomGenerator.getRandomString(5));
        stringList.add(RandomGenerator.getRandomString(6));
        stringList.add(RandomGenerator.getRandomString(2));
        stringList.add(RandomGenerator.getRandomString(1));
        stringList.add(RandomGenerator.getRandomString(7));
        System.out.println(stringList);

        String optionalS = hasFewestLowerCase(stringList);

        System.out.println(optionalS);

    }


    //原书写的妙啊，直接调用写好的方法
    public static int countLowerCase(String string) {
        return (int) string.chars().filter(Character::isLowerCase).count();
    }

    public static String hasFewestLowerCase(List<String> strings) {
        return strings.stream().min(Comparator.comparing(Question7::countLowerCase)).orElse("字符串没有任何内容");
    }





}
