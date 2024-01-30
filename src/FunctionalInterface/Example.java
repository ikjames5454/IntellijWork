package FunctionalInterface;

import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number)->{
            getSquareOf(number);
        };
        consumer.accept(10);
    }

    private static void getSquareOf(Integer number) {
        System.out.println(number * number);
    }
}
