package FunctionalInterface;

import java.util.function.Predicate;

public class Example3 {
    public static void main(String[] args) {
        Predicate<String> predicate = (word)-> word.length() > 5;
        System.out.println(predicate.test("number"));
}}
