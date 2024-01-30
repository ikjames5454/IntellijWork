package intermediateOperation;

import java.util.List;

public class Stream6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
        Double result = numbers.stream().map((number)->Math.pow(number,number)).reduce(0.0,Double::sum);
        System.out.println(result);
    }

}
