package java8.com.insightfullogic.java8.exercises.chapter3;

import java8.com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;

public class Question2 {

    public static int countBandMembersInternal(List<Artist> artists) {
        return (int) artists.stream()
               .mapToLong(artist -> artist.getMembers().count())
                .sum();
    }
}
