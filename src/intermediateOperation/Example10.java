package intermediateOperation;

import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<String> phrases = List.of("jane", "ben", "def","jdk");
        phrases.stream().flatMapToInt((phrase)->phrase.chars()).forEach(System.out::println);
    }

}
