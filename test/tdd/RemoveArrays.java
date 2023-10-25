package tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveArrays {
    public static int[] iCanPosition(int[] element,int position, int value) {
        position(element, position,value);
        return element;
    }
    public static void position(int[] a, int position, int vr){
        for (int b = a.length-1; b > position; b--){
            a[b] = a[b-1];
        }
        a[position] = vr;
    }

    public int[] reverseArray(int[] element) {
        int oddNumbers = 0;
        int[] oddCollector = null;
        for ( int y = 0; y < element.length; y++) {
            if (y % 2 != 0) {
                oddNumbers++;
            }
        }
            oddCollector = new int[oddNumbers];
            int i = 0;
            for ( int a : element){
                if ( a % 2 != 0){
                    oddCollector[i++] = a;
                }
            }
            for ( int b = 0; b < oddCollector.length; b++){
                oddCollector[b] -= 2;
            }
           return  oddCollector;


    }
    public int[] reverseArrays(int[] elements){
        int number = 0;
        int[] evenCollector = null;
        for (int n = 0; n < elements.length; n++){
            if ( n % 2 == 0){
                number++;
            }
        }
        evenCollector = new int[number];
        int m = 0;
        for ( int i : elements){
            if ( i % 2 == 0){
                evenCollector[m++] = i;
            }
        }
        for ( int name = 0; name < evenCollector.length; name++){
            evenCollector[name] -= 2;
        }
        return evenCollector;
    }

    public int[] reversingArrays(int[] element) {
        int temp = 0;
        for ( int r = 0; r < element.length/2; r++){
            temp = element[r];
            element[r] = element[element.length - r - 1];
            element[element.length - r - 1] = temp;
        }
//        for ( int n : element){
//
//        }
        return element;
    }

    public int[] reversingArraying(int[] element) {
        int temp = 0;
        for ( int n = 0; n < element.length; n += 2){
            temp = element[n];
            element[n] = element[n + 1];
            element[n + 1] = temp;
        }
//        for ( int num : element){
//
//        }
        return element;
    }

    public int[] Arrays(int[] element) {
        int temp = 0;
        int num = 3;
        int nums = element.length-4;
        while (num < nums){
            temp = element[num];
            element[num] = element[nums];
            element[nums] = temp;
            num++;
            nums--;
        }
        for ( int y : element){

        }
        return element;

    }

    public int[] ArraysOf(int[] element) {
        for ( int n = 0; n < element.length;n++){
            element[n] += 9;
        }
        for (int n = 0; n < element.length; n++){
            if (n % 2 != 0){
                element[n] -= 5;
            }

        }

        return element;
    }

    public static int[]
    iCanAdd(int[] element) {
        remove(element, 67);
        remove(element, 967);
        remove(element, 7);
        return element;
    }
    public static void remove(int[] a, int vr){
        for ( int b = a.length-1; b > 0; b--){
            a[b] = a[b-1];
        }
        a[0] = vr;
    }

    public int[] findLargestNumber(int[] element) {
        int largest = element[0];
        for ( int a = 0; a < element.length; a++){
            if (element[a] > largest){
                largest = element[a];
            }

        }
        return new int[]{largest};
    }

    public int findSmallestNumber(int[] array) {
        int smallest = array[0];
        for ( int a = 0; a < array.length; a++){
            if (array[a] < smallest){
                smallest = array[a];
            }

        }
        return smallest;

    }

    public int findDuplicate(int[] array) {
        for (int a = 0; a < array.length; a++){
            for (int b = a+1; b < array.length; b++){
                if (array[a] == array[b]){
                    return array[b];
                }
            }
        }
        throw new NullPointerException("no duplicate element");
    }

    public int findDifferencesAndLargest(int[] array) {
        int[] c = new int[array.length-1];
        int largest = c[0];
        for (int a = 0; a < array.length-1; a++){
            int b = array[a] - array[a+1];
            c[a] = b;
        }
        for (int b = 0; b < c.length; b++){
            if ( c[b] > largest){
                largest = c[b];
            }

        }
        return largest;
    }

    public int binarySearch(int[] array, int i) {
        int temp = 0;
        for ( int a = 0; a < array.length;a++){
            for ( int b = a; b < array.length; b++){
                if ( array[a] > array[b]){
                    temp = array[a];
                    array[a] = array[b];
                    array[b] = temp;
                }
            }
        }
        return search(array,i);
    }
    private int search(int[] array, int position){
        int a = 0;
        int b = array.length-1;
        while (a <= b){
            int middle = (a + b)/2;
            int middleNumber = array[middle];
            if (position == middleNumber){
                return middle;
            }
            if(position < middleNumber){
                b = middle - 1;
            }
            else {
                a = middle + 1;
            }

        }
        return -1;
    }

    public  int[] positionSearch(int[] element) {
        int[] copy = element.clone();
        int[] number = new int[element.length];
        int temp =0;
        for (int a = 0; a < element.length; a++){
            for (int b = a; b < element.length; b++){
                if ( element[a] > element[b]){
                    temp = element[a];
                    element[a] = element[b];
                    element[b] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(element));
        for ( int a = 0; a < element.length; a++){
            for ( int b =0; b < copy.length; b++){
                if (element[a] == copy[b]){
                    number[b] = a;
                }

            }
        }
        System.out.println(Arrays.toString(number));
        return number;
    }

    public static void main(String[] args) {
        RemoveArrays arrays = new RemoveArrays();
        int[] a = {22, 41, 15, 81, 2, 1,7,8,5};
        int[] b = {22, 41, 15, 81,5};
//        arrays.positionSearch(a);
        System.out.print( arrays.canJoin(a,b) + " ");
    }

    public ArrayList<Integer> canJoin(int[] i, int[] r) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int a = i.length-1; a >= 0; a--){
            number.add(i[a]);
        }
        for (int b = r.length-1; b >= 0; b--){
            number.add(r[b]);
        }
        return number;
    }

    public int mostFrequent(int[] i) {
        int mostFrequent = i[0];
        int store = 0;
        for (int a = 0; a < i.length; a++){
            int count = 0;
            for (int b = 0; b < i.length; b++){
                if (i[a] == i[b]){
                    count++;
                }
            }
            if (count > mostFrequent){
                mostFrequent = count;
                store = i[a];
            }
        }
        return store;
    }

    public int[] swapping(int[] number) {
        int num1 = number[2];
        int num2 = number[4];
        number[2] += num2;
        number[4] += num1;

        number[2] -= num1;
        number[4] -= num2;
        return number;
//        number[2] ^= number[4];
//        number[4] ^= number[2];
//        number[2] ^= number[4];

    }


    public int[] movingZeroes(int[] element) {
        int temp = 0;
        for (int a = 0; a < element.length; a++){
            for (int b = a + 1; b < element.length; b++){
                if (element[a] == 0){
                    temp = element[b];
                    element[b] = element[a];
                    element[a] = temp;
                }
            }
        }
        return element;
    }
}
