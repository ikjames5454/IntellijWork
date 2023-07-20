package Chibuzor;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while ( count < 10){
            System.out.print("the scores of each student: ");
            int scores = input.nextInt();
            sum = sum + scores;
            count++;

        }
        System.out.printf("the sum of the scores is : %d",sum);

    }
}
