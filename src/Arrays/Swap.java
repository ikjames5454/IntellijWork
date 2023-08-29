package Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8};

        int temps = 0;
        for (int num = 0; num < arrays.length ; num += 2){
             temps = arrays[num];
            arrays[num] = arrays[num + 1];
            arrays[num + 1] = temps;


        }
        for ( int n = 0; n < arrays.length; n++){
            System.out.print( arrays[n] + " ");
      }

   }
}


