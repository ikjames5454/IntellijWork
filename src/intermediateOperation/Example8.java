package intermediateOperation;

import java.util.Arrays;
import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        List<String> phrases = List.of("jane", "ben", "def","jdk");
       var result = phrases.stream().flatMap((phrase)-> Arrays.stream(phrase.split(""))).count();
        System.out.println(result);
        /**
         * map"()                   flatMap()
         * maptoint
         * mapToDouble
         * mapToLong
         **/
    }
}
