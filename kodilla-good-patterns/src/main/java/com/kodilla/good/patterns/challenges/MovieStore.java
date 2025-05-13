package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MovieStore {
    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");
        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");
        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
        return booksTitlesWithTranslations;
    }

    public static void streamTitles() {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .filter(entry -> entry.getValue().size() > 0)
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .map(Object -> Object.toString() + "!")
                .forEach(System.out::print);
    }

    public static void streamTitlesWithTranslations() {
        MovieStore movieStore = new MovieStore();
        String wynik = movieStore.getMovies().values().stream()
                .flatMap(List::stream)
                .collect(Collectors.joining("!"));

        System.out.println(wynik);
    }
}