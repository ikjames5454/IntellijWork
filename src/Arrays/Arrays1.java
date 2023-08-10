package Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 3 + 2 * counter;
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
        System.out.println(Arrays.toString(array));

    }
}
