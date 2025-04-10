package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1, 3, 5, 2, 4, 6, 2, 1, 3, 3, 3, 4, 2, 4, 4, 5, 1, 2, 4, 5};
        //When
        double average = getAverage(numbers);
        //Then
        assertEquals(3.2, average, 0.001);
    }
}
