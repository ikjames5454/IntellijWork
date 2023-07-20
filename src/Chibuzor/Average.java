package Chibuzor;

import java.util.Scanner;

public class Average {
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
            int average = sum / count;
            System.out.printf("the average of the scores is : %d",average);

        }
    }

