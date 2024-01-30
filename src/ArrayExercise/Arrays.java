package ArrayExercise;

public class Arrays {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,5,6,7,8,9,10};
        for (int i= 0; i < arrays.length;i++){
            if ( arrays[i] % 2 == 0) {
                System.out.println(arrays[i]);
            }
        }
    }
}
