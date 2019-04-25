package fpinjava.chapter2;

/**
 *
 * @param <T> Long
 * @param <U> Double
 * @param <V> Integer
 */

interface ComposeR<T,U,V> extends Function<Function<U, V>, Function<Function<T, U>, Function<T, V>>> {

}