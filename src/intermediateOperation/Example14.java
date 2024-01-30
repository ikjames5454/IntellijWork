package intermediateOperation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Example14 {
    public static void main(String[] args) {
        List<String> phrases = List.of("jane", "ben", "def","def","jdk");
        String s = phrases.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining(",","(",")"));
        String d = phrases.stream().flatMap((element)->stream(element.split(""))).distinct().collect(Collectors.joining(",","(",")"));
        System.out.println(s);
        System.out.println(d);
    }
}
