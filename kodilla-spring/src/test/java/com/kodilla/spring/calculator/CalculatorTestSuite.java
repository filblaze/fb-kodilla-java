package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given

        //When
        double result1 = calculator.add(1, 2);
        double result2 = calculator.sub(2, 1);
        double result3 = calculator.mul(2, 3);
        double result4 = calculator.div(8, 2);

        //Then
        assertEquals(3, result1);
        assertEquals(1, result2);
        assertEquals(6, result3);
        assertEquals(4, result4);
    }
}
