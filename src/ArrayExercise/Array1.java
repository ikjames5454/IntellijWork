package ArrayExercise;

import java.util.Arrays;

public class Array1 {
    int count = 0;
    public static void main(String[] args) {
        Array1 a = new Array1();

        int[] arrays = new int[6];

        for (int i = 0; i < arrays.length; i++){
            a.insert(arrays, i + 1);


        }

        a.print(arrays);
        a.start(arrays, 32);
        a.start(arrays, 67);
        a.start(arrays, 90);
        a.inserts(arrays, 4,89);



    }
    public void insert(int[] a, int vr){
        a[count++] = vr;

    }
    public void print(int[] a){
        System.out.println(Arrays.toString(a));
    }
    public void start(int[] a, int vr){
        for(int v = count-1; v > 0; v--){
            a[v] = a[v-1];
        }
        a[0] = vr;
        System.out.println(Arrays.toString(a));
    }
    public void inserts(int[] b, int position, int val){
        for (int a = count-1; a > position; a--){
            b[a] = b[a-1];
        }
        b[position] = val;
        System.out.println(Arrays.toString(b));
    }

}
