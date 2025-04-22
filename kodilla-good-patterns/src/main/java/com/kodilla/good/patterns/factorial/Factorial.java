package com.kodilla.good.patterns.factorial;

public class Factorial {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i < n + 1; i++) {
            result = result * i;
        }
        return result;
    }
}
