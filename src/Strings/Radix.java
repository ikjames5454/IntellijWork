package Strings;

import java.util.Scanner;

import static java.lang.System.in;

public class Radix {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.println("Enter a radix: ");
        int radix = input.nextInt();

        System.out.println("please choose any of the option \n 1.Convert digit to character \n 2.Convert character to digit " );
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("enter digit");
                int digit = input.nextInt();
                char convert = Character.forDigit(digit, radix);
                System.out.println(convert);
            }
            case 2 -> {
                System.out.println("enter a character");
                char character = input.next().charAt(0);
                int number = Character.digit(character, radix);
                System.out.println(number);
            }
        }

    }
}
