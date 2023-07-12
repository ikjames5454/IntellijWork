package tdd;

import java.util.Scanner;

public class Factorial {

    private static int question;

    public static void main(String[] args) {
        Factorial calc = new Factorial();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int answer = calc.convertToFactorial(input.nextInt());
        System.out.println((question) + "! is = " + answer);
        double exponential = calc.convertToExponential(3);
        System.out.println(exponential);
    }
    public int convertToFactorial(int number) {
        question = number;

        if(number == 0){return 1;
        }
        if(number == 1) {
            return 1;
        }
        if(number < 0){
            terminate();
        }
        if(number > 12){
            return 1;
        }
    int factorial = 1;
    while (number > 0){
        factorial = factorial * number;
        number = number - 1;

        }
        
        return factorial;
    }

    private static void  terminate() {
        System.out.print("""
                         negative integers are not acceptable
                         don,t try it again next time
                """);
        System.exit(1);
    }

    public double convertToExponential(int number) {
        final int ONE = 1;
        double exponential = 1;
        for (int index = ONE; index <= number;index++){
            double quotient = Math.pow(number, index);
            double factorial = convertToFactorial(index);
            exponential = exponential + quotient /factorial;

        }

        return exponential;

    }
}
