package tdd;

public class Swaps {
    public int[] swapping(int[] swap) {
        int[] swaps = {1, 2, 3, 4, 5, 6};
        int temp = 0;
        for (int n = 0; n < swaps.length; n += 2){
            temp = swaps[n];
            swaps[n] = swaps[n + 1];
            swaps[n + 1] = temp;
        }
        for(int b : swaps){
            return new int[]{b};
        }
        return swaps;
    }

}
