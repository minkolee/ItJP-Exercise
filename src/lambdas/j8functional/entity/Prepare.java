package lambdas.j8functional.entity;

import cc.conyli.commons.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class Prepare {


    public static List<Track> getTrackList(int length) {
        List<Track> tracks = new ArrayList<>();
        for (int j = 0; j < length; j++) {
            Track track = new Track();
            track.setName(RandomGenerator.getRandomString(4));
            tracks.add(track);
        }
        return tracks;
    }

    public static List<Artist> getArtistList(int length) {
        List<Artist> artists = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            Artist artist = new Artist();
            artist.setName(RandomGenerator.getRandomString(5));
            artist.setOrigin(RandomGenerator.getRandomString(10));
            int count = RandomGenerator.getRandomIntFrom1(4);
            for (int j = 0; j < count; j++) {
                String name = RandomGenerator.getRandomString(5);
                artist.addMember(name);
            }

            artists.add(artist);
        }
        return artists;
    }

    public static List<Album> getAlbumList(int length) {
        List<Album> albums = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            Album album = new Album();
            album.setName(RandomGenerator.getRandomString(6));
            int count = RandomGenerator.getRandomIntFrom1(6);
            for (int j = 0; j < count; j++) {
                Track track = new Track();
                track.setName(RandomGenerator.getRandomString(4));
                album.addTrack(track);
            }
            album.setMusicians(RandomGenerator.getRandomString(3));
            albums.add(album);
        }

        return albums;
    }

}
