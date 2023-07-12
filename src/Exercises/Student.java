package Exercises;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeNumber = 0;
        int total = 0;
        while (true) {
            System.out.print("Enter the grade ");
            int grade = input.nextInt();
            if (grade == 50) {
                break;
            }
            if(grade < 0){
                continue;
            }
            if(grade > 100){
                break;
            }

            if (grade > 0) {

            }
            total = total + grade;
            gradeNumber++;

        }
        int average = total / gradeNumber;
        System.out.println(average);
    }
}
