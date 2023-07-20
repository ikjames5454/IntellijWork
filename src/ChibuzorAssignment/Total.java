package ChibuzorAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Total {
    public static void main(String[] args) {
        List<Integer> runningTotal = new ArrayList<>(Arrays.asList(2,6,9,8,4,9,1,67));
        System.out.println(runningTotal);
        int sum = 0;
        for (int n = 0; n < runningTotal.size();n++){

            sum += runningTotal.get(n);

            System.out.print(sum + " ");
        }




    }
}
