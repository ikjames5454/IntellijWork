package Chibuzor;

import java.util.Scanner;

public class SumAndAverage {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int count = 1;
            int sum = 0;
            while ( count < 11){
                System.out.print("the scores of each student: ");
                int scores = input.nextInt();
                sum = sum + scores;
                count++;

            }
            int average = sum / 10;
            System.out.printf("the sum of the scores is : %d",sum);
            System.out.printf("\nthe average of the scores is : %d",average);

        }
    }


