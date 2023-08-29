package Arrays;

public class odd {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8,9};

        int temp = 0;
        for (int num = 0; num < array.length - 1; num += 2){
            temp = array[num];
            array[num] = array[num + 1];
            array[num + 1] = temp;


        }
        for ( int n = 0; n < array.length; n++){
            System.out.print( array[n] + " ");
        }
    }
}
