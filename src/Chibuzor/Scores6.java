package Chibuzor;

import java.util.Scanner;

public class Scores6 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            double average = 0;
            int countEven = 0;
            for(int count = 1; count < 11;count++) {
                System.out.print("the scores of each student: ");
                int scores = input.nextInt();
                if (scores % 2 == 0) {
                    sum = sum + scores;
                    countEven++;


                    average = (double) sum / countEven;
                }
            }



            System.out.printf("the average of the scores is : %.2f", average);








        }
    }






