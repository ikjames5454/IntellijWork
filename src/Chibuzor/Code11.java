package Chibuzor;

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for ( int count = 1; count < 11; count++){
            System.out.print("the scores of each student: ");
            int scores = input.nextInt();
            sum = sum + scores;
            if (scores == 30){
                sum = 0;
                count = 0;


            }


        }
        System.out.printf("the sum of the scores is : %d",sum);

    }
}
