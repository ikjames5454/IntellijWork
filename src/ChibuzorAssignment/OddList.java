package ChibuzorAssignment;

import java.util.Arrays;

public class OddList {
    public static void main(String[] args) {
        int[] number = new int[] {23, 67, 56,34,7,45,8,9,6};
        System.out.println("Element in list array");

        for ( int num = 0; num < number.length; num++){

            if (num % 2 != 0){
                System.out.println(number[num]);

            }

        }
        System.out.println(Arrays.toString(number));





    }
}
