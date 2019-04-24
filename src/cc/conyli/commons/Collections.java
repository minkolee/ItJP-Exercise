package cc.conyli.commons;

import java.time.Year;
import java.util.stream.Stream;

public class Collections {


    public static int addCollection(Stream<Integer> stream) {

        return stream.reduce(0, (x, y) -> x + y);
    }
}
