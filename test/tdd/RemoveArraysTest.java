package tdd;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveArraysTest {

    @Test
    public void ICanRemoveNumbers(){
       RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.reverseArray( new int[]{22, 41, 15, 8, 2, 1});
        int[] expected = {39, 13, -1};
        assertArrayEquals(actual,expected);



    }
    @Test
    public void ICanRemoveOddNumbers(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.reverseArrays( new int[]{22, 41, 15, 8, 2, 1,7,8});
        int[] expected = {20, 6, 0, 6};
        assertArrayEquals(actual, expected);

    }
    @Test
    public void ICanReverseAnArray(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.reversingArrays( new int[]{22, 41, 15, 8, 2, 1,7,8});
        int[] expected = {8, 7, 1,2, 8, 15, 41, 22};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void ICanSwapAnArray(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.reversingArraying( new int[]{22, 41, 15, 8, 2, 1,7,8});
        int[] expected ={41, 22, 8, 15, 1, 2, 8, 7};
        assertArrayEquals(actual, expected);

    }
    @Test
    public void ICanMiddleSwap(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.Arrays( new int[]{22, 41, 15, 8, 2, 1,7,8});
        int[] expected = {22, 41, 15, 2, 8, 1, 7, 8};
        assertArrayEquals(actual, expected);

    }
    @Test
    public void ICanGetLargestNumber(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.ArraysOf( new int[]{22, 41, 15, 8, 2, 1,7,8});
        int[] expect = {31,50,24,17,11,10,16,17};
        int[] expected = {31,45,24,12,11,5,16,12};
        assertArrayEquals(actual, expected);


    }
    @Test
    public void ICanAdd(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = RemoveArrays.iCanAdd( new int[]{22, 41, 15, 8, 2, 1,7,8});
        int[] expected = {7,967,67,22, 41, 15, 8, 2,};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void position(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = RemoveArrays.iCanPosition( new int[]{22, 41, 15, 8, 2, 1,7,8});
        int[] expected = {22, 41, 15, 8, 60, 2, 1,7};
        assertArrayEquals(actual, expected);

    }



}
