package Exercises;

import java.util.Scanner;

public class Financial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subTotal and a gratuity rate");
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = gratuityRate / subTotal;
        double total = gratuity + subTotal;
        System.out.printf("%n The gratuity is $%.1f and total is $%.1f", gratuity,total);

    }
}
