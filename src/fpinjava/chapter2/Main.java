package fpinjava.chapter2;

public class Main {

    public static void main(String[] args) {

        //将Function看做一个函数对象
        //自己可以定义其他函数对象，这是乘以3倍
        Function<Integer, Integer> triple = arg -> arg * 3;

        //这是平方
        Function<Integer, Integer> square = arg -> arg * arg;

        //静态方法Compose用于组合两个Integer泛型的函数

//        Function<Integer, Integer> tripleThenSquare = Function.compose(triple, square);
//
//        System.out.println(tripleThenSquare.apply(4));
//
//        Function<Integer, Integer> squareThenTriple = Function.compose(square, triple);
//
//        System.out.println(squareThenTriple.apply(4));

        BinaryOperator add = x -> y -> x + y;

        BinaryOperator multi = x -> y -> x * y;

        BinaryOperator pow = x -> y-> {
            int temp = 1;
            for (int i = 0; i < y; i++) {
                temp *= x;
            }
            return temp;
        };


        System.out.println(add.apply(3).apply(4));
        System.out.println(multi.apply(3).apply(4));
        System.out.println(pow.apply(5).apply(5));

    }

}
