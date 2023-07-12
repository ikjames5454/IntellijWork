package Exercises;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
        int totalScore = 0;
        int numberOfStudent = 0;
        while (numberOfStudent < 20) {
            System.out.print("Enter the individual score");
            int individualScore = input.nextInt();
            if (individualScore > 0) {

            }
            totalScore = totalScore + individualScore;
            numberOfStudent = numberOfStudent + 1;
        }
        int averageScore = totalScore / numberOfStudent;


        System.out.print("******************************************************************\n");
        System.out.print("\t\t\tAso Rock Secondary School,Abuja Nigeria\t\n");
        System.out.print("******************************************************************\n");
        System.out.print("Class:SS 3\n");
        System.out.printf("Number of Student in Class: %d\n", numberOfStudent);
        System.out.printf("Total score: %d\n", totalScore);
       System.out.printf("Average Score: %d\n", averageScore);
        System.out.print("******************************************************************\n");
    }

    }
