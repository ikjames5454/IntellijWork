package ArrayExercise;

import java.util.Arrays;

public class movingZeroes {
    public static void main(String[] args) {


        int[] a = {4, 3, 0, 2, 0, 0, 4, 10, 12};
int temp = 0;
for (int b = 0; b < a.length; b++){
    for (int c = b + 1; c < a.length; c++){
        if (a[b] == 0){
            temp = a[c];
            a[c] = a[b];
            a[b] = temp;

        }
    }
    System.out.println(Arrays.toString(a));

}
        System.out.println(Arrays.toString(a));
    }

    }


