package fpinjava.chapter2;

public interface Function<T, U> {

    //标准的应用于一个参数返回一个结果
    U apply(T arg);

    //这是两个组合函数返回自己和另外一个方法的组合，先调其他方法，再调自己
    //这个看不明白的话，注意x用的是自己的方法，f从V返回T，自己的apply从T返回U，整个函数是V->U,
    // T- Integer
//     U- Double
    // f是String , Integer 由于 f先执行，返回值一定是Integer，这个OK，然后有个新类型肯定是最初的类型，就是V - String
    //然后自己执行，得到Double，所以自己执行后返回的函数是String->Double 也就是Function<V,U>

    //这个<V>表示新引入的泛型

    default <V> Function<V, U> compose(Function<V, T> f) {
        return x -> apply(f.apply(x));
    }

    //如果先调自己，再调其他，会什么样子
    //注意，此时的自己是那个中间函数，不是返回最终值的函数，因此此时T—>初始的变量，U->是中间的变量
    //新引入的泛型V其实是最终结果
    //所以作为andThen的函数其实是从中间变量生成最终结果的函数

    //T- string
    //U -integer
    //V -double
//
//    default <V> Function<T, V> andThen(Function<U, V> f) {
//        return x -> f.apply(apply(x));
//    }

    default <V> Function<T, V> andThen(Function<U, V> f) {
        return x -> f.apply(apply(x));
    }

    //恒等函数
    static <T> Function<T, T> identity() {
        return t -> t;
    }

    static <T, U, V> Function<V, U> compose(Function<T, U> f, Function<V, T> g) {
        return x -> f.apply(g.apply(x));
    }

    static <T, U, V> Function<T, V> andThen(Function<T, U> f, Function<U, V> g) {
        return x -> g.apply(f.apply(x));
    }

    static <T, U, V> Function<Function<T, U>, Function<Function<U, V>, Function<T, V>>> compose() {
        return x -> y -> y.compose(x);
    }

    static <T, U, V> Function<Function<T, U>, Function<Function<V, T>, Function<V, U>>> andThen() {
        return x -> y -> y.andThen(x);
    }

    static <T, U, V> Function<Function<U, V>, Function<Function<T, U>, Function<T, V>>> higherCompose() {
        return f -> g -> x -> f.apply(g.apply(x));
    }

    static <T, U, V> Function<Function<T, U>, Function<Function<U, V>, Function<T, V>>> higherAndThen() {
        return f -> g -> z -> g.apply(f.apply(z));
    }
}
