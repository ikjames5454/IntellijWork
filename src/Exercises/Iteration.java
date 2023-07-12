package Exercises;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int total = 0;
        while (number <= 10) {
            System.out.println("Enter the student grade");
            int studentGrade = input.nextInt();
            if (studentGrade == 6) {
                break;
            }
            if (studentGrade > 0) {
            }
            total = total + studentGrade;

            number = number + 1;
        }


            int average = total / number;
            System.out.print(total + "\n");
            System.out.print(average + "\n");










    }
}
