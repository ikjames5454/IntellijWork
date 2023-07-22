package Chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise39 {
    public static void main(String[] args) {

        int[] numbers = new int[4];

        for(int num = 0;num < numbers.length;num++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the digit number: ");
            int number = input.nextInt();
            numbers[num] = number;
            numbers[num] += 7;
            numbers[num] %= 10;

//            numbers[0] = numbers[2];
//            numbers[1] = numbers[3];

        }
        System.out.println(Arrays.toString(numbers));
    }
}
