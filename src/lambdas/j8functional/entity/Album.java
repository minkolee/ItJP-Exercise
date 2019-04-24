package lambdas.j8functional.entity;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;

    private List<Track> tracks = new ArrayList<>();

    private String musicians;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public String getMusicians() {
        return musicians;
    }

    public void setMusicians(String musicians) {
        this.musicians = musicians;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                ", musicians='" + musicians + '\'' +
                '}';
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }

}
