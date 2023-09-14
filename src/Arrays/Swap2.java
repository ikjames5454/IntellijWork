package Arrays;

public class Swap2 {
    public static void main(String[] args) {
        swap();

    }
    public static void swap(){
        int[] swapping = {45, 52, 11, 33, 48, 25};
//        int temp =0;
//        int num = 2;
//        int nums = swapping.length-3;
//        while (num < nums){
//            temp = swapping[num];
//            swapping[num] = swapping[nums];
//            swapping[nums] = temp;
//            num++;
//            nums--;
//            }
//
//        for ( int a : swapping){
//            System.out.print(a + " ");
//        }
        int temp = 0;
        for ( int n = 0; n < swapping.length/2; n++){
            temp = swapping[n];
            swapping[n] = swapping[n+1];
            swapping[n+1] = temp;
        }
        for ( int a : swapping){
            System.out.print(a + " ");
        }

    }
}
