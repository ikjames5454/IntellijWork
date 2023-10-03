package ArrayExercise;

public class Array8 {
    public static void main(String[] args) {


        int[] name = {5, 7, 15, 1, 9};
        int[] store = new int[name.length];
        int b;
        int largest = name[0];
        for (int a = 0; a < name.length-1; a++) {
            b = name[a] - name[a+1];
            store[a] = b;
            System.out.print(b + " ");
            if (store[a] > largest){
                largest = store[a];
            }
        }
        System.out.println();
        System.out.print(largest);
//        for(int c = 0; c < store.length; c++){
//            if (store[c] > largest){
//                largest = store[c];
//            }
//
//        }
//        System.out.print(largest + " ");
        }






    }

