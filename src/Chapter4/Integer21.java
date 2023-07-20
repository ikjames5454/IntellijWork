package Chapter4;

import java.util.Scanner;

public class Integer21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        int smallestNumber = 0;
        for(int counter = 1; counter <= 10; counter++){
            System.out.print("Enter the integer number: ");
            int integer = input.nextInt();
            if ( integer > largestNumber){
                largestNumber = integer;


            }
        }

        System.out.println("largestNumber is: " + largestNumber);

    }
}
