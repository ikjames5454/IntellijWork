package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {
    public static void main(String[] args) {
        System.out.println("The original array is: ");
        Integer[] arrays = new Integer[]{54,67,89,22,45,90};
        for (int b: arrays){
            System.out.print(b + " ");
        }
        Arrays.sort((arrays), Collections.reverseOrder());
        System.out.println("\n" + "the sorted arrays is : ");
        for (int a : arrays){
            System.out.print(a + " ");
        }



        int sort;
        for ( int num = 0; num < arrays.length; num++){
            for (int nums = num ; nums < arrays.length; nums++){
                if (arrays[num] > arrays[nums]){
                    sort = arrays[num];
                    arrays[num] = arrays[nums];
                    arrays[nums] = sort;
                }
            }

        }
        for (int n = 0; n < arrays.length;n++){
            System.out.println(arrays[n]);
        }

   }
}

