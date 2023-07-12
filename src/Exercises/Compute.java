package Exercises;

import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integerPositive = 0;
        int integerNegative = 0;
        float sum = 0;
        int number = 0;
        while (true){
            System.out.print("Enter either positive or negative number(or zero to break): ");
            float integer = input.nextFloat();
            if (integer == 0){
                break;
            }

            sum = sum + integer;
            number = number + 1;






            if (integer > 0){
                integerPositive = integerPositive + 1;
            }
            if (integer < 0){
                integerNegative = integerNegative + 1;
            }
        }
        float average = sum / number;
        System.out.println("The positive number: " + integerPositive);
        System.out.println("The negative number: " + integerNegative);
        System.out.printf("\nThe total number: %.2f",sum);
        System.out.printf("\n the average: %.2f",average);

    }
}
