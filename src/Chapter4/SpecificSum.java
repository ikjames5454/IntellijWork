package Chapter4;

import java.util.Scanner;

public class SpecificSum {
//    4.34 (Reading numbers until a specified sum) Write an application that asks for a number from
//    the user and then keeps reading integer values from the user until the sum of those integers equals
//    or becomes greater than the value that was input in the beginning.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial sum number: ");
        int initialSumNumber = input.nextInt();

        int sums = 0;
        while (sums < initialSumNumber) {

            System.out.println("Enter the integer number: ");
             int number = input.nextInt();
             sums += number;
        }
        System.out.println("the sums has exceeded initial sum");
        System.out.println("the sums is now: " + sums);




    }

}

