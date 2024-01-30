package intermediateOperation;

import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<String> numbers = List.of("jane", "ben");
       var result = numbers.stream().count();
        System.out.println(result);
    }
}
