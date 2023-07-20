package ChibuzorAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(2,6,9,8,4,9,1));

        for (int row = 0, r = number.size() -1; row < r ; row++){
            number.add(row, number.remove(r));

        }
        System.out.println(number);
    }
}
