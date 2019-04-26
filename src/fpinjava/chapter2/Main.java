package fpinjava.chapter2;


public class Main {

    public static void main(String[] args) {


        Function<String, Integer> stringIntegerFunction = x -> {
            System.out.println("string 转换成 integer的函数执行了");
            return Integer.parseInt(x) * 100;};

        Function<Integer, Double> integerDoubleFunction = x -> {
            System.out.println("integer 转 Double的函数执行了");
            return x + 1000.0;
        };

        //这个compose是最外层的compose最内层的
        Function<String, Double> stringDoubleFunction = integerDoubleFunction.compose(stringIntegerFunction);
        Function<String, Double> stringDoubleFunction1 =(stringIntegerFunction.andThen(integerDoubleFunction));

        System.out.println(stringDoubleFunction1.apply("5"));
    }

}
