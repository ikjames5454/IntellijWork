package ArrayExercise;

import java.util.Arrays;

public class Delete {
    static int count = 5;
    public static void main(String[] args) {
        int[] array = {3, 7, 23, 9, 12, 4, 9};
        System.out.println(array.length);
        array = deleteValue(array, 13); // Assign the modified array back to 'array'
        System.out.println(Arrays.toString(array));
        System.out.print(array.length);
    }

    public static int[] deleteValue(int[] b, int vr) {
        int countToDelete = 0;

        // Count the occurrences of 'vr' in the array
        for (int a = 0; a < b.length; a++) {
            if (b[a] == vr) {
                countToDelete++;
            }
        }

        if (countToDelete == 0) {
            return b; // No 'vr' found, return the original array
        }

        int[] newArray = new int[b.length - countToDelete];
        int newIndex = 0;

        // Copy elements from 'b' to 'newArray', excluding 'vr'
        for (int a = 0; a < b.length; a++) {
            if (b[a] != vr) {
                newArray[newIndex] = b[a];
                newIndex++;
            }
        }

        return newArray;
    }
}
