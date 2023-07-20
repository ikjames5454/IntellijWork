package Chibuzor;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] num = new int[6];
        int largestNumber = num[0];
        int count = 1;
        int d = 0;
        while ( d < num.length){
            num[d] = count * 2;

            if (num[d] > largestNumber){
                largestNumber = num[d];

            }


            d++;
            count++;
        }
        System.out.println(Arrays.toString(num));
        System.out.println(largestNumber);
    }
}
