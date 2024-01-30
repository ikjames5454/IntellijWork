package intermediateOperation;

import java.util.List;

public class Stream4 {
    public static void main(String[] args) {
        List<String> numbers = List.of("janes", "ben", "benza");
        numbers.stream().filter((number)->number.length()==5).filter((number)->number.startsWith("j")).forEach((number)-> System.out.println("number: " + number));
    }
}
