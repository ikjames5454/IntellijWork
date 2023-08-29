package ChibuzorAssignment;

public class ArrayOfLargestNumbers {
    public static void main(String[] args) {
        int[] number = {23, 99, 3,4,1,55,60,9,10};
        int largestNumber = number[0];

        for( int num = 0; num < number.length; num++){
            if ( number[num] > largestNumber){

                largestNumber = number[num];

            }

        }

        System.out.println( "\n" + "the largest number is :" + largestNumber);





    }
}

