package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] object = new int[10];

        System.out.printf("%s%10s\n", "index", "column");
        for ( int d = 0; d < object.length;d++){
            System.out.printf("%s%10s\n", d , object[d]);
            object[9] = 45 / 5;
            object[1] = -120;
            object[2] = 10;
            object[5] = 1200;
            object[3] = 190;
            object[0] = 89;
            object[4] = 1;
            object[7] = 30;
            object[6] = 95;
            object[8] = (object[5] + object[3]) / object[2];





        }
        System.out.println(Arrays.toString(object));


    }
}
