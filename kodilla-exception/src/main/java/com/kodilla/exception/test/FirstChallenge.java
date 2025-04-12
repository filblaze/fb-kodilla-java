package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        double result = a/b;
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Not divisible by zero");
            result = 0;
        }
        return result;
    }

    public double AToBPower(double a, double b) {
        double result = a;
        if (b == 0) {
            result = 1;
        } else if (a == 0) {
            result = 0;
        } else {
            for (int i = 0; i < b -1; i++) {
                result *= a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

        double result2 = firstChallenge.AToBPower(3, 1);
        System.out.println(result2);
    }
}