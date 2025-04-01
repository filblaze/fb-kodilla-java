package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.*;

@DisplayName("CollectionTestSuite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: start");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When empty list is provided then " +
            "return empty list information and stop")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator o = new OddNumbersExterminator();
        Integer[] liczby = new Integer[]{};
        //When
        System.out.println("Testing empty list");
        o.exterminate(Arrays.asList(liczby));
        //Then
        Assertions.assertEquals(Collections.emptyList(), o.exterminate(Arrays.asList(liczby)));
    }

    @DisplayName("When an Integer number list is provided " +
            "then return List<Integer> of even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator o = new OddNumbersExterminator();
        Integer[] liczby = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //When
        System.out.println("Testing normal list");
        o.exterminate(Arrays.asList(liczby));
        //Then
        Assertions.assertEquals(Arrays.asList(2, 4, 6, 8, 10), o.exterminate(Arrays.asList(liczby)));
    }

    @DisplayName("When an Integer number list without even numbers is provided " +
            "then return no even number in list information")
    @Test
    void testOddNumbersExterminatorNormalListWithOutEvenNumbers() {
        //Given
        OddNumbersExterminator o = new OddNumbersExterminator();
        Integer[] liczby = new Integer[]{1, 3, 5, 7, 9};
        //When
        System.out.println("Testing normal list w/o even numbers");
        o.exterminate(Arrays.asList(liczby));
        //Then
        Assertions.assertEquals(Collections.emptyList(), o.exterminate(Arrays.asList(liczby)));
    }
}
