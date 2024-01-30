package FunctionalInterface;

import java.util.function.BiFunction;

public class Example6 {
    public static void main(String[] args) {
        BiFunction<String,Integer,Boolean> biFunction = (word,number)->word.length()==number;
        System.out.println(biFunction.apply("Hello",5));
    }
}
