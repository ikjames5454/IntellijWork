package intermediateOperation;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40);
        Stream<Integer> stream = numbers.stream();
        Consumer<Integer> integerConsumer =  (number) -> System.out.println("number: " + number);
        stream.forEach(integerConsumer);
    }
}
