package lambdas.j8functional.chapter4;

import lambdas.j8functional.entity.Artist;

import java.util.stream.Stream;

public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();


}
