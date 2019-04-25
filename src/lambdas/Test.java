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

//               String[] names = new String[]{"jey","saner6", "champanzee", "cony", "minko",};
//
//        Arrays.sort(names, (Comparator.comparing(String::length)));
//
//        System.out.print(Arrays.toString(names));

        Adder adder1 = new Adder(1, "saner");
        Adder adder2 = new Adder(2, "saner");
        Adder adder3 = new Adder(3, "saner");
        Adder adder4 = new Adder(4, "saner");
        Adder adder5 = new Adder(5, "saner");
        System.out.println(adder1.addAnother(adder2).addAnother(adder3).addAnother(adder4).addAnother(adder5));






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