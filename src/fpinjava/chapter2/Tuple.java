package fpinjava.chapter2;

public class Tuple<A, B> {

    private A _1;
    private B _2;

    public Tuple(A a, B b) {
        this._1 = a;
        this._2 = b;
    }

    public A get_1() {
        return _1;
    }

    public B get_2() {
        return _2;
    }

    public void set_1(A _1) {
        this._1 = _1;
    }

    public void set_2(B _2) {
        this._2 = _2;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "_1=" + _1 +
                ", _2=" + _2 +
                '}';
    }
}
