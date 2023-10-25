package strings;

import java.util.Scanner;

import static java.lang.System.in;

public class AddDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.print("Enter digit number: ");
        int number = input.nextInt();
        while (number >= 10){
            int sum  = 0;
            while (number > 0){
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        System.out.println(number);

    }
}
