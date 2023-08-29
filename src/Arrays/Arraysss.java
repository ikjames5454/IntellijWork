package Arrays;

public class Arraysss {
    public static void main(String[] args) {


        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8};
        int temp;
        for (int a = 0; a < arrays.length; a +=2) {

            temp = arrays[a];
            arrays[a] = arrays[a + 1];
            arrays[a + 1] = temp;



        }
        for ( int a : arrays){
            System.out.print(a + " ");
        }
    }
}
