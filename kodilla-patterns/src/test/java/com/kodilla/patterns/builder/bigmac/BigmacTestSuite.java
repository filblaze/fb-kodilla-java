package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac burger = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BigmacBuilder.SESAME)
                .burgers(2)
                .sauce(Bigmac.BigmacBuilder.STANDARD)
                .ingredient(Bigmac.BigmacBuilder.BACON)
                .ingredient(Bigmac.BigmacBuilder.CHEESE)
                .build();
        System.out.println(burger);

        //When
        String bun = burger.getBun();
        int burgers = burger.getBurgers();
        String sauce = burger.getSauce();
        int ingredientsNum = burger.getIngredients().size();

        //Then
        assertEquals("SESAME", bun);
        assertEquals(2, burgers);
        assertEquals("STANDARD", sauce);
        assertEquals(2, ingredientsNum);
    }
}
