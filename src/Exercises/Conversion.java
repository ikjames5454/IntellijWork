package Exercises;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number in pounds:");
        double pounds = keyboardInput.nextDouble();
        double onePoundInKilogram = 0.454;
        double multiplePoundInKilogram = pounds * onePoundInKilogram;
        System.out.printf("%.1f pounds is %.3f kilograms",pounds,multiplePoundInKilogram);
// converting pounds into kilogram
    }
}
