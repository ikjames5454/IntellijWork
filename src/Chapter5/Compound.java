package Chapter5;

import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount in pennies: ");
        int principal = input.nextInt();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        System.out.println("Year\tInterest Rate\tAmount on Deposit");

        for (double annualRate = 0.05; annualRate <= 0.10; annualRate += 0.01) {
            int amount;
            int dollars;
            int cents;

            System.out.printf("\tInterest Rate: %.2f%%%n", annualRate * 100);

            for (int year = 1; year <= years; year++) {
                amount = principal * 100; // Convert principal to pennies

                // Calculate amount with compound interest using integers
                for (int i = 0; i < year; i++) {
                    amount += (amount * annualRate);

                }
                System.out.printf("%d%30d%n",year, amount);

            }
        }
    }
}
//(Modified Compound-Interest Program) Modify the compound-interest application of
//        Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//        vary the interest rate.