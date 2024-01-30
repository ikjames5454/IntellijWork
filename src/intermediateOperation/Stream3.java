package intermediateOperation;

import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> numbers = List.of("jane", "ben");
        numbers.stream().forEach((number)->{
            String result = number
                    .concat(":").concat("" +number.length());
            System.out.println(result);
        }) ;

    }
    }

