package fpinjava.chapter2.temp;

import fpinjava.chapter2.Function;

/**
 *
 * @param <T> Long
 * @param <U> Double
 * @param <V> Integer
 */

interface ComposeThen<T,U,V> extends Function<Function<T, U>, Function<Function<U, V>, Function<T, V>>> {

}