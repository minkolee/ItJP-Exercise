package lambdas.j8functional.chapter5;

import cc.conyli.commons.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(RandomGenerator.getRandomIntFrom1(10));
        list.add(RandomGenerator.getRandomIntFrom1(10));
        list.add(RandomGenerator.getRandomIntFrom1(10));
        list.add(RandomGenerator.getRandomIntFrom1(10));
        list.add(RandomGenerator.getRandomIntFrom1(10));
        list.add(RandomGenerator.getRandomIntFrom1(10));
        list.add(RandomGenerator.getRandomIntFrom1(10));
        list.add(RandomGenerator.getRandomIntFrom1(10));

        System.out.println(list);

        //固定生成Map<Boolean, List<T>>
        Map<Boolean, List<Integer>> map = list.stream().sorted().collect(Collectors.partitioningBy(x -> x > 5));

        List<Person> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setName(RandomGenerator.getRandomString(4));
            if (i < 3) {
                person.setType("1");
            } else if (i < 6) {
                person.setType("2");
            } else {
                person.setType("3");

            }
            list1.add(person);
        }


        Map<String, List<String>> map1 = list1.stream().collect(Collectors.groupingBy(Person::getType, Collectors.mapping(Person::getName, Collectors.toList())));

        System.out.println(map1);

        String formatedString = list1.stream().map(x->x.getName()).collect(Collectors.joining("|","[[","]]"));

        System.out.println(formatedString);

        //统计每种type的人数



    }
}
