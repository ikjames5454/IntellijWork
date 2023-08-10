package Chapter5;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        System.out.println("Number of years" + "\t\t\t" + "Interest rates at each year" + "\t\t\t" + "Amount each year and each interest rate");

        for (double percent = 0.05; percent < 0.10; percent += 0.01){
            int p = 1000;
            double a;
            System.out.printf("\t\tInterest rate at number of years: %.2f%%%n", percent * 100);
            for (int year = 1; year <= years; year++){
                a = Math.pow((1 + percent),years);


                for( int n = 1; n < year; n++){
                     a += a;


                 }

                 System.out.printf("%d%35.2f",year,a);
            }


        }


    }
}
//(Modified Compound-Interest Program) Modify the compound-interest application of
//        Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//        vary the interest rate.
//A person invests $1,000 in a savings account yielding 5% interest. Assuming that all
//        the interest is left on deposit, calculate and print the amount of money in the account
//        at the end of each year for 10 years. Use the following formula to determine the
//        amounts:

//        a = p (1 + r)n
//        where
//        p is the original amount invested (i.e., the principal)
//        r is the annual interest rate (e.g., use 0.05 for 5%)
//        n is the number of years
//        a is the amount on deposit at the end of the nth year.
