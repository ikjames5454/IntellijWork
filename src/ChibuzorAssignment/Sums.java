package ChibuzorAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sums {
    public static void main(String[] args) {
        List<Integer> runningTotal = new ArrayList<>(Arrays.asList(2,6,9,8,4,9,56,9,33));
        System.out.println(runningTotal);
        int sum = 0;
        for ( int num = 0; num < runningTotal.size(); num++){
            sum += runningTotal.get(num);
        }
        System.out.println("the sum is: " + sum);

        List<Integer> runningList = new ArrayList<>(Arrays.asList(2,6,9,8,4,9,56,9,33));
        System.out.println(runningList);
        int numb = 0;
        while (numb < runningList.size()){
            sum += runningList.get(numb);
            numb++;

        }
        System.out.println("the sum of the array is : " + sum);

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(2,6,9,8,4,9,56,9,33));
        System.out.println(arrayList);
         int nums = 0;
        do{
            System.out.println("sum total is: " + sum);
            sum += runningList.get(nums);
            nums++;
        } while (nums > arrayList.size());


    }


}
