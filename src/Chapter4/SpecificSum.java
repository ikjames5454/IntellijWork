package Chapter4;

import java.util.Scanner;

public class SpecificSum {
//    4.34 (Reading numbers until a specified sum) Write an application that asks for a number from
//    the user and then keeps reading integer values from the user until the sum of those integers equals
//    or becomes greater than the value that was input in the beginning.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        System.out.println("Enter the integer number: ");
        int number = input.nextInt();

        while (number != 0) {

            sum = sum + number;
            counter++;
            System.out.println("Enter the integer number: ");
             number = input.nextInt();


            if ( number >= sum ){
                break;
            }
        }
        System.out.println("the sum: " + sum);




    }

}

