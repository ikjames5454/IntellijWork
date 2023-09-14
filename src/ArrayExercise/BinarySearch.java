package ArrayExercise;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {45,67,89,23,12,4,5,7,2,7};
        int temp = 0;
        for (int num = 0;num < arr.length;num++){
            for (int nums = num; nums < arr.length; nums++){
                if ( arr[num] > arr[nums]){
                    temp = arr[num];
                    arr[num] = arr[nums];
                    arr[nums] = temp;
                }
            }
        }
        for ( int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println(binary(arr,89));

    }

    public static int binary(int[] a, int findNumber){
        int lower = 0;
        int higher = a.length -1;
        while (lower <= higher){
            int middlePosition = (lower + higher) / 2;
            int middleNumber = a[middlePosition];
            if (findNumber == middleNumber){
                return middlePosition;
            }
            if (findNumber < middleNumber){
                higher = middlePosition -1;
            }
            else {
                lower = middlePosition + 1;
            }
        }
        return -1;
    }
}
