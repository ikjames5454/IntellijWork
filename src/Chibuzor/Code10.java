package Chibuzor;

import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int validCounter = 0;


        for (int count = 1; count < 11; count++) {
            System.out.print("the scores of each student between 0 and 100: ");
            int scores = input.nextInt();
            if (scores > 0 && scores < 100) {


                sum = sum + scores;
                validCounter++;
            }
        }

            double average = (double)sum / validCounter;





        System.out.printf("%d\n",sum);
        System.out.printf("%.2f",average);

    }

}

