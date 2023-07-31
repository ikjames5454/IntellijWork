package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximum = 0;
        int minimum = 0;
        int sum = 0;
        for (int i = 1; i < 10; i++){
            System.out.println("Enter the integer number: ");
            int num = input.nextInt();
            if (num > maximum ){
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
