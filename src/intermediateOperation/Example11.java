package intermediateOperation;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        List<String> phrases = List.of("jane", "ben", "def","jdk");
        Set<String> strings = phrases.stream().map((element)->element).collect(Collectors.toSet());
        System.out.println(strings);
    }

}
