package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        public static final String SESAME = "SESAME";
        public static final String PLAIN = "PLAIN";
        private String bun;
        private int burgers;
        public static final String STANDARD = "STANDARD";
        public static final String ISLANDS = "ISLANDS";
        public static final String BBQ = "BBQ";
        private String sauce;
        public static final String LETTUCE = "LETTUCE";
        public static final String ONION = "ONION";
        public static final String BACON = "BACON";
        public static final String PICKLE = "PICKLE";
        public static final String CHILLI = "CHILLI";
        public static final String MUSHROOM = "MUSHROOM";
        public static final String SHRIMP = "SHRIMP";
        public static final String CHEESE = "CHEESE";
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals(SESAME) || bun.equals(PLAIN)) {
                this.bun = bun;
            } else {
                throw new IllegalArgumentException("Bun can only be SESAME or PLAIN");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD) || sauce.equals(ISLANDS) || sauce.equals(BBQ)) {
                this.sauce = sauce;
            } else {
                throw new IllegalArgumentException("Sauce can only be STANDARD, ISLANDS or BBQ");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BACON)
            || ingredient.equals(PICKLE) || ingredient.equals(CHILLI) || ingredient.equals(MUSHROOM)
            || ingredient.equals(SHRIMP) || ingredient.equals(CHEESE)) {
                this.ingredients.add(ingredient);
            } else {
                throw new IllegalArgumentException("Must choose from ingredient list.");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
