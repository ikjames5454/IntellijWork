package Chapter4;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if (number1 == number2) {
            System.out.println("numbers are equal: " + 0);
        } else {
            if (number1 > number2) {

                System.out.println("number1 are greater than number2: " + 10);
            } else {
                System.out.println("number2 is greater than number1: " + -1);
            }


        }
    }

}

