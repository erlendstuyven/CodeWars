package java8.com.insightfullogic.java8.answers.chapter4;

import java8.com.insightfullogic.java8.examples.chapter1.Artist;
import java8.com.insightfullogic.java8.examples.chapter1.SampleData;
import java8.com.insightfullogic.java8.exercises.chapter4.ArtistsDef;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ArtistsTest {

    private final ArtistsDef optionalExamples = new ArtistsDef(SampleData.getThreeArtists());

    @Test
    public void indexWithinRange() {
        Optional<Artist> artist = optionalExamples.getArtist(0);
        assertTrue(artist.isPresent());
    }

    @Test
    public void indexOutsideRange() {
        Optional<Artist> artist = optionalExamples.getArtist(4);
        assertFalse(artist.isPresent());
    }

    @Test
    public void nameIndexInsideRange() {
        String artist = optionalExamples.getArtistName(0);
        Assert.assertEquals("John Coltrane", artist);
    }

    @Test
    public void nameIndexOutsideRange() {
        String artist = optionalExamples.getArtistName(4);
        assertEquals("unknown", artist);
    }

}
