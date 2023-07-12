package Exercises;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_Score = 0;
        int number_Of_Student = 0;
        while (true) {
            System.out.print("input individual score");
            int individual_Score = input.nextInt();
            if (individual_Score == -25) {
                break;
            }
            if (individual_Score > 0) {

            }
            total_Score = total_Score + individual_Score;
            number_Of_Student = number_Of_Student + 1;
        }
        int average_Score = total_Score / number_Of_Student;

        System.out.print("******************************************************************\n");

        System.out.print("\t\t\tAso Rock Secondary School,Abuja Nigeria\t\n");
        System.out.print("******************************************************************\n");
        System.out.print("Class:SS 3\n");
        System.out.printf("Number of Student in Class: %d\n", number_Of_Student);
        System.out.printf("Total score: %d\n", total_Score);
        System.out.printf("Average Score: %d\n", average_Score);
        System.out.print("******************************************************************\n");
    }

}
