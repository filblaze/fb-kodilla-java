package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testLoopAndConditionalBreakpoints {

    @Test
    void testLoop() {
        //Given
        long sum = 0;

        //When
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.println("[" + i + "] Sum equals: " + sum);
        }

        //Then
        assertEquals(499500, sum);
    }
}
