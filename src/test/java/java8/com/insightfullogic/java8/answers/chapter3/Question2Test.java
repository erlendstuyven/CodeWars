package java8.com.insightfullogic.java8.answers.chapter3;

import java8.com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static java8.com.insightfullogic.java8.exercises.chapter3.Question2.countBandMembersInternal;


public class Question2Test {

    @Test
    public void internal() {
        Assert.assertEquals(4, countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }

}
