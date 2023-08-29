package Arrays;

public class duplicate {
    public static void main(String[] args) {
        int[] arrays = {1, 2,3, 4, 5, 7, 3,9, 4};
        for ( int a = 0; a < arrays.length;a++){
            for (int b = a + 1 ; b < arrays.length; b++){
                if ( arrays[a] == arrays[b] ){
                    System.out.print(arrays[b] + " ");
                }
            }
        }
    }
}
