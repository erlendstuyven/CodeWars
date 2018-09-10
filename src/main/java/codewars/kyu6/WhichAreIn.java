package codewars.kyu6;

import java.util.Arrays;

class WhichAreIn {

    static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(s -> filterBy(s, array2))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }

    private static boolean filterBy(String s, String[] array2) {
        return Arrays.stream(array2).filter(s1 -> s1.contains(s)).count() > 0;
    }
}