package intermediateOperation;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Examplw13 {
    public static void main(String[] args) {
        List<String> phrases = List.of("jane", "ben", "def","jdk");
       LinkedList<String> strings = phrases.stream().map((x)->x).collect(Collectors.toCollection(()->new LinkedList<>()));
        System.out.println(strings);
    }
}
