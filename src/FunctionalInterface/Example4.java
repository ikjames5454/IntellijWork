package FunctionalInterface;

import java.util.function.BiPredicate;

public class Example4 {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (word,number)->word.length()==number;
        System.out.println(biPredicate.test("hello",5));
    }
}
