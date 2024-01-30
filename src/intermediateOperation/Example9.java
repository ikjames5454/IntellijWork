package intermediateOperation;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<String> phrases = List.of("jane", "ben", "def","jdk");
         phrases.stream().mapToDouble((phrase)->Double.valueOf(phrase.length())).forEach(System.out::println);
    }
}
