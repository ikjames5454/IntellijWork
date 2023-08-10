package Chapter5;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercise14 {
    public static void main(String[] args) {
        account();
//        Modified Compound-Interest Program) Modify the compound-interest application of
//        Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//        vary the interest rate.
//        A person invests $1,000 in a savings account yielding 5% interest. Assuming that all
//        the interest is left on deposit, calculate and print the amount of money in the account
//        at the end of each year for 10 years. Use the following formula to determine the
//        amounts:

//        a = p (1 + r)n
//        where
//        p is the original amount invested (i.e., the principal)
//        r is the annual interest rate (e.g., use 0.05 for 5%)
//        n is the number of years
//        a is the amount on deposit at the end of the nth year.

    }

    public static void account() {
        System.out.println("Year" + "\t\t\t\t" + "Amount of money each year");
        double [] results = new double[10];

        DecimalFormat format = new DecimalFormat("#.000");

        for (int year = 1; year <= 10; year++) {

            int p = 1000;
            double r = 0.05;
            double a;

            a = p * Math.pow((1 + r), year);

            System.out.printf("%4d%35s \n", year, format.format(a));

            results[year-1] = Double.parseDouble(format.format(a));



            }

        System.out.println(Arrays.toString(results));

        }
    }

