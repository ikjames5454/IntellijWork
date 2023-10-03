package Chibuzor;

import java.util.Arrays;

public class Array {
    private static int[] total;
    private static  int[] compare;
    public static void main(String[] args) {
        arraySort();

    }
    public static void arraySort(){
        int[] arrays = {5,18,32,3,4};
        compare = arrays.clone();
        int[] element = new int[arrays.length];
        int num;
        for(num = 0; num < arrays.length ; num++){

            total = arrays;
        }
//        Arrays.sort(total);
        int temp = 0;
        for (int a = 0; a < total.length; a++){
            for (int b = a; b < total.length; b++){
                if (total[a] > total[b]){
                    temp = total[a];
                    total[a] = total[b];
                    total[b] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(total));
        System.out.println();

       for ( int nums = 0; nums < total.length; nums++) {
            for (int index = 0; index < compare.length; index++){
                if (total[nums] == compare[index]){
                    element[index] = nums ;

                }


            }



        }

        System.out.println(Arrays.toString(element));




    }
}
