package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public void eat(Eatable eatable) {
        System.out.println("调用eat方法");
        String result = eatable.taste();
        System.out.print(result);

    }


    public static void main(String[] args) {

        String[] names = new String[]{"jey","saner6", "champanzee", "cony", "minko",};

        Arrays.sort(names, (Comparator.comparing(String::length)));

        System.out.print(Arrays.toString(names));

    }


}


@FunctionalInterface
interface Eatable {
    String taste();


}

interface Flyable {
    void fly();
}

interface Addable {
    int add(int a, int b);
}