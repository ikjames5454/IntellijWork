package ArrayExercise;

public class Array7 {
    public static void main(String[] args) {
        int[] a = {5,2,6,10,9,3};

        int b = 2;
        int c = a.length-2;
        int temp = 0;
        while ( b < c){
            temp = a[b];
            a[b] = a[c];
            a[c] = temp;
            b++;
            c--;
        }
        for (int f : a){
            System.out.print(f + " ");
        }

    }
}
