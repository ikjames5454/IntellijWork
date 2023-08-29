package Arrays;

public class question3 {
    public static void main(String[] args) {
        int[] arrays = {45, 52, 33, 11, 48, 25};
        int temp =0;
        int num = 0;
        int nums = arrays.length-1;
        while (num < nums){
            temp = arrays[num];
            arrays[num] = arrays[nums];
            arrays[nums] = temp;
            num++;
            nums--;


    }
        for ( int c : arrays){
            System.out.print( c + " ");
        }

    }
}
