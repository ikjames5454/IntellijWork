package Chibuzor;

import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int count = 1; count < 11;) {
            System.out.print("the scores of each student between 0 and 100: ");
            int scores = input.nextInt();
            if ( scores > 0 && scores < 100) {


                sum = sum + scores;
                count++;
            }



        }
        System.out.printf("%d",sum);
    }

}



