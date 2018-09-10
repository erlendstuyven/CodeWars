package java8.com.insightfullogic.java8.exercises.chapter5;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fibonacci {

    List<Integer> integers;

    public Fibonacci() {
        integers = new ArrayList<>();
    }

    // Fibonacci old scool
    public long fibonacci(int x) {
        for (int y=0; y<=x; y++) {
            if (y==0) {
                integers.add(0);
            } else if (y==1) {
                integers.add(1);
            } else {
                integers.add(integers.get(y-1) + integers.get(y-2));
            }
        }
        return integers.get(x);
    }

    public long fibonacci2(int times) {
        List<Integer> integerList = IntStream.iterate(0, x -> x + 1).limit(times).boxed().collect(Collectors.toList());
        return integerList.get(times-1);
    }

}
