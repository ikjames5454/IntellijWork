package FunctionalInterface;

import java.util.function.Function;

public class Example5 {
    public static void main(String[] args) {
        Function<String, Integer> function = (word)->word.length();
        System.out.println(function.apply("semicolon"));
    }
}
