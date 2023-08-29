package tdd;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapsTest {

    @Test
    public void ICanSwap(){
        Swaps swap = new Swaps();
        int[] arr = swap.swapping(new int[]{1, 2, 3, 4, 5, 6});
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expected,arr);
    }
}
