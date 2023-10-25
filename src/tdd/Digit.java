package tdd;

import java.util.Scanner;

import static java.lang.System.in;

public class Digit {
    public static int addDigits(int digits) {
        while (digits >= 10){
            int sum = 0;
            while (digits > 0){
                sum += digits % 10;
                digits /= 10;
            }
            digits = sum;
        }
        return digits;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.println("Enter your number: ");
        int number = input.nextInt();
       int result = addDigits(number);
        System.out.println(result);

    }
}
