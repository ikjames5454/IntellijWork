package ArrayExercise;

public class Array4 {
    public static void main(String[] args) {
        Array4 arr = new Array4();
        int[] b = {45,6,23,89,12,45};
        int n = arr.find(b, 12);
        if ( n == -1){
            System.out.println("not found");
        }
        else {
            System.out.println("the index is: " + n);
        }

    }
    public int find(int[] a, int vr){
        for (int c = 0; c < a.length; c++){
            if ( a[c] == vr){
                return c;
            }
        }
        return -1;
    }
}
