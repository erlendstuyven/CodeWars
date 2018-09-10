package java8.com.insightfullogic.java8.exercises.chapter4;

import java8.com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.Optional;

public class ArtistsDef {

    private List<Artist> artists;

    public ArtistsDef(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            return Optional.empty();
        }
        return Optional.ofNullable(artists.get(index));
    }

    private void indexException(int index) {
        throw new IllegalArgumentException(index +
                                           " doesn't correspond to an Artist");
    }

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        return artist.map(art -> art.getName())
                .orElse("unknown");
    }

}
