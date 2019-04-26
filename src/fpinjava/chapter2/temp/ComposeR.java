package fpinjava.chapter2.temp;

import fpinjava.chapter2.Function;

/**
 *
 * @param <T> Long
 * @param <U> Double
 * @param <V> Integer
 */

interface ComposeR<T,U,V> extends Function<Function<U, V>, Function<Function<T, U>, Function<T, V>>> {

}