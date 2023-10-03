package Arrays;

import java.util.Arrays;

public class OddNumber {
    public static void main(String[] args) {
        int[] arrays = {22, 41,15, 8, 2, 1};

        for ( int nums = 0; nums < arrays.length; nums++ ){
            if(arrays[nums] % 2 != 0) {
                arrays[nums] -= 2;

            }
        }
        System.out.println(Arrays.toString(arrays));

    }
}
