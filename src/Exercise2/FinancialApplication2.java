package Exercise2;

import java.util.Scanner;

public class FinancialApplication2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter interest amount: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),numberOfYears * 12);
        System.out.printf("Accumulated value is $%.2f",futureInvestmentValue);

    }
}