package Exercise2;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate: ");
        int balance = input.nextInt();
        double annualInterestRate = input.nextDouble();


        double interest = balance * (annualInterestRate / 1200);

        System.out.printf("The interest is %.5f",interest);
    }
}
