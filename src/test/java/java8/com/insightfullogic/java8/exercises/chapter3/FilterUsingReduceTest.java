package java8.com.insightfullogic.java8.exercises.chapter3;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class FilterUsingReduceTest {

    @Test
    public void emptyList() {
        Predicate<Object> predicate = x -> false;
        List<Object> input = Collections.<Object>emptyList();
        List<Object> expectedOutput = Collections.<Object>emptyList();
        List<Object> output = FilterUsingReduce.filter(input.stream(), predicate);
        assertEquals(expectedOutput, output);

        List<Object> parallelOutput = FilterUsingReduce.filter(input.parallelStream(), predicate);

        assertEquals(expectedOutput, parallelOutput);
    }

    @Test
    public void trueReturnsEverything() {
        Predicate<Integer> predicate = (Integer x) -> true;
        List<Integer> input = asList(1, 2, 3);
        List<Integer> expectedOutput = asList(1, 2, 3);
        List<Integer> output = FilterUsingReduce.filter(input.stream(), predicate);
        assertEquals(expectedOutput, output);

        List<Integer> parallelOutput = FilterUsingReduce.filter(input.parallelStream(), predicate);

        assertEquals(expectedOutput, parallelOutput);
    }

    @Test
    public void falseRemovesEverything() {
        assertFiltered((Integer x) -> false, asList(1, 2, 3), asList());
    }

    @Test
    public void filterPartOfList() {
        assertFiltered((Integer x) -> x > 2, asList(1, 2, 3), asList(3));
    }

    private <I> void assertFiltered(Predicate<I> predicate, List<I> input, List<I> expectedOutput) {
        List<I> output = FilterUsingReduce.filter(input.stream(), predicate);
        assertEquals(expectedOutput, output);

        List<I> parallelOutput = FilterUsingReduce.filter(input.parallelStream(), predicate);
        assertEquals(expectedOutput, parallelOutput);
    }

}
