package intermediateOperation;

import java.util.List;

public class Stream5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
       Integer result = numbers.stream().reduce(0,(identity,number)->identity+number); System.out.println(result) ;
    }
    }
