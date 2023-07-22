package Chapter4;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
//        (Palindromes) A palindrome is a sequence of characters that reads the same backward as for-
//                ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
//        and 11611. Write an application that reads in a five-digit integer and determines whether it’s a pal-
//                indrome. If the number is not five digits long, display an error message and allow the user to enter
//        a new value.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the five digit number of your choice: ");
        int digit = input.nextInt();

        int digit1 = digit / 10000  ;
        int digit2 = (digit % 10000) / 1000;
        int digit3 = ( digit % 1000) / 100;
        int digit4 = ( digit % 100)/ 10;
        int digit5 =  digit % 10;

        int digitTotal = digit1 + digit2 + digit3 + digit4 + digit5;
        System.out.println(digitTotal);
        System.out.printf(" %d %d %d %d %d \n",digit1,digit2,digit3,digit4,digit5);

        boolean palindrome = ( digit1 == digit5) && ( digit2 == digit4);
        if (palindrome) {
            System.out.println("The digit is a palindrome");
        }
        else{
            System.out.println("The digit is not a palindrome");
        }
    }
}
