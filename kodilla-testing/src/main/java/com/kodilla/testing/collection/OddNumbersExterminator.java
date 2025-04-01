package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public OddNumbersExterminator() {
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("Empty list, please provide at least one number");
            return Collections.emptyList();
        } else {
            List<Integer> result = new ArrayList<Integer>();
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    result.add(number);
                }
            }
            if (result.isEmpty()) {
                System.out.println("No even numbers in the list");
                return Collections.emptyList();
            } else {
                System.out.println(result);
                return result;
            }
        }
    }
}