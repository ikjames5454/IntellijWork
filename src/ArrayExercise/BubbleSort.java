package ArrayExercise;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3,6,8,23,5,90,12,0,34};
        int temp = 0;
        for (int b = 0; b < a.length-1; b++){
            for (int c = 0; c < a.length-b-1;c++){
                if (a[0] > a[c+1]){
                    temp = a[c];
                    a[c] = a[c+1];
                    a[c+1] = temp;
                }
            }
        }
        for (int d : a){
            System.out.print(d + " ");
        }
    }
}
