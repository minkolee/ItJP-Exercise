package fpinjava.chapter2.temp;

import fpinjava.chapter2.Function;
import fpinjava.chapter2.Tuple;

public interface TupleToC<A,B,C> extends Function<Tuple<A,B>, C> {
    public static <T, U, V> Function<U, Function<T, V>> reverseArgs(Function<T, Function<U, V>> f) {
        return u -> t -> f.apply(t).apply(u);
    }
}
