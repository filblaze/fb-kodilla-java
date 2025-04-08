package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Alfabet zaczyna sie od: ", (text) -> text + "abc");
        poemBeautifier.beautify(" to poczatek alfabetu.", (text) -> "abc" + text);
        poemBeautifier.beautify("MALE LITERKI", text -> text.toLowerCase());
        poemBeautifier.beautify("wielkie litery", text -> text.toUpperCase());
        poemBeautifier.beautify("Pierwsza litera tego tekstu to: ", text -> text + text.charAt(0));
        poemBeautifier.beautify("Zmien pierwsze a na b.", text -> text.replaceFirst("a", "b"));
    }
}
