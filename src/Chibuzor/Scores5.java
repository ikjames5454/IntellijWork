package Chibuzor;

import java.util.Scanner;

public class Scores5 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int even = 0;
            for(int count = 1; count < 11;count++){
                System.out.print("the scores of each student: ");
                int scores = input.nextInt();
                if (scores % 2 == 0)
                    even = even + scores;
            }




            System.out.printf("the sum of the scores is : %d", even);



        }
    }




