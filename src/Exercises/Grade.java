package Exercises;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int aA = 0;
        int aB  = 0;
        int aC = 0;

        for(;a < 5;a++){
            System.out.println("Enter the student name: ");
            String studentName = input.nextLine();
            System.out.println("Enter the student grade: ");
            String grade = input.nextLine();

            switch(grade) {
                case "A":
                    aA++;
                    break;
                case "B":
                    aB++;
                    break;
                case "C":
                    aC++;
                    break;
                default:
                    System.out.println("invalid input");




            }





        }
        System.out.println(aA);
        System.out.println(aB);
        System.out.println(aC);



    }
}
