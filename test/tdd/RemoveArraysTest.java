package tdd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class RemoveArraysTest {

    @Test
    public void ICanRemoveNumbers() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.reverseArray(new int[]{22, 41, 15, 8, 2, 1});
        int[] expected = {39, 13, -1};
        assertArrayEquals(actual, expected);


    }

    @Test
    public void ICanRemoveOddNumbers() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.reverseArrays(new int[]{22, 41, 15, 8, 2, 1, 7, 8});
        int[] expected = {20, 6, 0, 6};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void ICanReverseAnArray() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.reversingArrays(new int[]{22, 41, 15, 8, 2, 1, 7, 8});
        int[] expected = {8, 7, 1, 2, 8, 15, 41, 22};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void ICanSwapAnArray() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.reversingArraying(new int[]{22, 41, 15, 8, 2, 1, 7, 8});
        int[] expected = {41, 22, 8, 15, 1, 2, 8, 7};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void ICanMiddleSwap() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.Arrays(new int[]{22, 41, 15, 8, 2, 1, 7, 8});
        int[] expected = {22, 41, 15, 2, 8, 1, 7, 8};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void ICanGetLargestNumber() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.ArraysOf(new int[]{22, 41, 15, 8, 2, 1, 7, 8});
        int[] expect = {31, 50, 24, 17, 11, 10, 16, 17};
        int[] expected = {31, 45, 24, 12, 11, 5, 16, 12};
        assertArrayEquals(actual, expected);


    }

    @Test
    public void ICanAdd() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = RemoveArrays.iCanAdd(new int[]{22, 41, 15, 8, 2, 1, 7, 8});
        int[] expected = {7, 967, 67, 22, 41, 15, 8, 2,};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void position() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = RemoveArrays.iCanPosition(new int[]{22, 41, 15, 8, 2, 1, 7, 8}, 4, 60);
        int[] expected = {22, 41, 15, 8, 60, 2, 1, 7};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void largestNumber() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] actual = removeArrays.findLargestNumber(new int[]{22, 41, 15, 81, 2, 1, 7, 8});
        int[] expected = {81};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void smallestNumber() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] array = {22, 41, 15, 81, 2, 1, 7, 8};
        int actual = removeArrays.findSmallestNumber(array);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void duplicate() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] array = {22, 41, 15, 81, 2, 1, 7, 8, 2, 5};
        int actual = removeArrays.findDuplicate(array);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void largest() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] array = {22, 41, 15, 81, 2, 1, 7, 8, 2, 5};
        int actual = removeArrays.findDifferencesAndLargest(array);
        int expected = 79;
        assertEquals(actual, expected);
    }

    @Test
    public void binarySort() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] array = {22, 41, 15, 81, 2, 1, 7, 8, 2, 5};
        int actual = removeArrays.binarySearch(array, 5);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void findPosition() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] array = removeArrays.positionSearch(new int[]{22, 41, 15, 81, 2, 1, 7, 8, 5});
        int[] expected = {6, 7, 5, 8, 1, 0, 3, 4, 2};
        assertArrayEquals(array, expected);
    }

    @Test
    public void testThatCanJoy() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] i = {1, 2, 5, 7, 8, 9};
        int[] r = {6, 9, 2, 4, 10};
        ArrayList<Integer> actual = removeArrays.canJoin(i, r);
        List<Integer> expected = List.of(9, 8, 7, 5, 2, 1, 10, 4, 2, 9, 6);
        assertIterableEquals(actual,expected);
    }
    @Test
    public void testThatCanFindMostOccurringElement(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] i = {1, 2, 5, 7, 8, 9,9,8,8,1,1,7,7,7,7,7,9};
        int num = removeArrays.mostFrequent(i);
        int expected = 7;
        assertEquals(num,expected);

    }
    @Test
    public void swapping() {
        RemoveArrays removeArrays = new RemoveArrays();
        int[] array = removeArrays.swapping(new int[]{22, 41, 15, 81, 2, 1, 7});
        int[] expected = {22, 41, 2, 81, 15, 1, 7};
        assertArrayEquals(array, expected);
    }
    @Test
    public void movingZeroes(){
        RemoveArrays removeArrays = new RemoveArrays();
        int[] array = removeArrays.movingZeroes(new int[]{0,22, 41, 15,0, 81, 0, 2, 1, 7});
        int[] expected = {22, 41, 15, 81, 2, 1, 7,0,0,0};
        assertArrayEquals(array, expected);
    }
}
