package FunctionalInterface;

import java.util.function.UnaryOperator;

public class Example7 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (number)->number*number;
        System.out.println(unaryOperator.apply(10));

    }
}
