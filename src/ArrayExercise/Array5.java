package ArrayExercise;

public class Array5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("The original array is");
        for(int b : arr){
            System.out.printf("%2d", b);
        }
        multiply(arr);
        System.out.println( "\nthe array after is");
        for(int c : arr) {
            System.out.printf("%3d",c);
        }
        System.out.println("\nbefore the elementMultiply: " + arr[4]);
        elementMultiply(arr[4]);
        System.out.println("the element at the index after the elementMultiply: " + arr[4]);


    }
    public static void multiply(int[] b){
        for (int a = 0; a < b.length; a++){
            b[a] *= 2;
        }

    }
    public static void elementMultiply(int element){
        element *= 2;
        System.out.println("the value of the multiplied element: " + element);
    }

}
