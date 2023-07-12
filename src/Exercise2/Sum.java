package Exercise2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 100: ");
        int number = input.nextInt();
        int digit_1 = number / 100;
        int digit_2 = (number % 100) / 10;
        int digit_3 = number % 10;
        int sum = digit_1 + digit_2 + digit_3;
        System.out.printf("%d %d %d\n",digit_1,digit_2,digit_3);
        System.out.println(sum);
    }
}
