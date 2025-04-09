package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("North America");
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        Country country1 = new Country("Poland", new BigDecimal("38000000000"));
        Country country2 = new Country("Germany", new BigDecimal("50000000000"));
        Country country3 = new Country("France", new BigDecimal("70000000000"));
        Country country4 = new Country("China", new BigDecimal("1500000000000"));
        Country country5 = new Country("Japan", new BigDecimal("75000000000"));
        Country country6 = new Country("South Korea", new BigDecimal("90000000000"));
        Country country7 = new Country("Canada", new BigDecimal("80000000000"));
        Country country8 = new Country("USA", new BigDecimal("320000000000"));
        Country country9 = new Country("Mexico", new BigDecimal("200000000000"));
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);
        continent3.addCountry(country7);
        continent3.addCountry(country8);
        continent3.addCountry(country9);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("2423000000000");
        Assertions.assertEquals(expectedPeople,  totalPeople);
    }
}
