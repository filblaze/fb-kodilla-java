package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

import static com.kodilla.good.patterns.factorial.Factorial.factorial;

public class Main {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .filter(entry -> entry.getValue().size() > 0)
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .map(Object -> Object.toString() + "!")
                .forEach(System.out::print);
    }
}