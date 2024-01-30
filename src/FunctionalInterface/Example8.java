package FunctionalInterface;

import java.util.function.BinaryOperator;

public class Example8 {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (num1,num3)->num1 + num3;
        System.out.println(binaryOperator.apply(4,5));
    }
}
