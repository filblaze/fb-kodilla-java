package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .average().getAsDouble();
    }
}
