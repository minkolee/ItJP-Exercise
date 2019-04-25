package fpinjava.chapter2;

public interface Function<T,R> {

    R apply(T t);

    static Function<Integer, Integer> compose(Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return arg -> f2.apply(f1.apply(arg));
    }
}
