package Arrays;

public class reversal {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        for ( int n = 0; n < num.length / 2; n++){
            int temp = 0;
            temp = num[num.length -1 -n];
            num[num.length -1 -n] = num[n];
            num[n] = temp;
        }
        for ( int a : num){
            System.out.print(a + " ");
        }
    }
}
