package codewars.kyu6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindOdd {
    public static int findIt(int[] A) {
        for (int distinctInt : Arrays.stream(A).distinct().toArray()) {
            long count = Arrays.stream(A).filter(integer -> integer == distinctInt).count();
            if (count % 2 != 0) {
                return distinctInt;
            }
        }
        return 0;
    }
}
