package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] reverse = {23, 45, 6, 7 ,8, 23, 78, 9};
        for (int a : reverse){
            System.out.print(a + " ");
        }
        System.out.println();
        int temp;
        int i = 0;
        int n = reverse.length-1;
        while (i < n){

            temp = reverse[i];
            reverse[i] = reverse[n];
            reverse[n] = temp;
            i++;
            n--;
        }
        for(int b : reverse){
            System.out.print(b + " ");
        }
    }
}
