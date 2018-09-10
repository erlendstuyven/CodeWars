package java8.com.insightfullogic.java8.exercises.chapter5;


import java8.com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.Comparator;
import java.util.List;

public class LongestName {

    public static Artist byReduce(List<Artist> artists) {
        return artists.stream()
                .reduce((artist, artist2) -> {return reduction(artist, artist2);
        }).orElseThrow(RuntimeException::new);
    }

    private static Artist reduction(Artist artist, Artist artist2) {
        if (artist.getName().length() > artist2.getName().length()){
            return artist;
        }
        return artist2;
    }

    public static Artist byCollecting(List<Artist> artists) {
        return artists.stream()
                .max(Comparator.comparing(artist -> artist.getName().length()))
                .orElseThrow(RuntimeException::new);
    }

}
