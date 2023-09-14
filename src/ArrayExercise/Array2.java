package ArrayExercise;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {


        int[] insert = new int[6];
        for (int b = 0; b < insert.length; b++) {
            insert[b] = b + 1;
        }
        System.out.println(Arrays.toString(insert));

        for (int c = insert.length - 1; c > 0; c--) {
            insert[c] = insert[c - 1];
        }

        insert[0] = 67;
        System.out.println(Arrays.toString(insert));
    }
}
