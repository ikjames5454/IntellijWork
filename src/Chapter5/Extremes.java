package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 1; i < 10; i++){
            System.out.println("Enter the integer number: ");
            int num = input.nextInt();
            if (num > maximum ) {
                maximum = num;
            }
            if (num < minimum){
                minimum = num;

            }
            sum = maximum + minimum;

        }
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(sum);
    }
}
