package ChibuzorAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolSystem {

    private final static Scanner input = new Scanner(System.in);
    private static String[][] multidimensionalArray;
    private static String numberOfStudent;
    private static String numberOfScores;


    public static void main(String[] args) {
        System.out.println("      Lagbaja Schools' Grade  System!");


        nameConvention();
        nameConvention2();
        scoresForStudentAndSubject();
        System.out.println(Arrays.deepToString(multidimensionalArray));





    }

    public static void nameConvention() {
        System.out.println("How many student do you have?: ");
        String number_of_student = input.nextLine();
        if (number_of_student.matches("^^(?:100|[1-9]?[0-9])$")) {
            numberOfStudent = number_of_student;

        } else {
            System.out.println("invalid number; try again: ");
            nameConvention();
        }
    }

        public static void nameConvention2 () {
            System.out.println("How many subject do they offer?: ");
            String subject = input.nextLine();

            if (subject.matches("^^(?:100|[1-9]?[0-9])$")) {
                numberOfScores = subject;


            } else {
                System.out.println("invalid number; try again: ");
                nameConvention2();


            }
            int timer = 100;
            int num = 17;

            try {
                for (int i = 0; i < num; i++) {
                    System.out.print("Saving");
                    for (int j = 0; j <= i; j++) {
                        System.out.print(">");
                    }
                    Thread.sleep(timer);
                    for (int j = 0; j < 8 + i; j++) {
                        System.out.print("\b");
                    }
                }
                System.out.println("Saving>>>>>>>>>>>>>>>>>");
                System.out.println("Saved");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

   public static void scoresForStudentAndSubject() {
       String[][] multiArray = new String[Integer.parseInt(numberOfStudent)][Integer.parseInt(numberOfScores)];
       for(int num = 0; num < multiArray.length; num++){
           for(int number = 0; number < multiArray[num].length; number++){
               System.out.println("Entering Score for student" + " " + (  1 + num) + " :");
               System.out.println("Enter number for subject" + " " + (  1 + number) + " :");
               int nums = input.nextInt();
               if (nums >= 0  && nums <= 100) {



               }


               else{
                   System.out.println("invalid input, try again later");
                   scoresForStudentAndSubject();
               }
               multiArray[num][number] = String.valueOf(nums);
               multidimensionalArray = multiArray;


               int timer = 100;
               int occurence = 17;

               try {
                   for (int i = 0; i < occurence; i++) {
                       System.out.print("Saving");
                       for (int j = 0; j <= i; j++) {
                           System.out.print(">");
                       }
                       Thread.sleep(timer);
                       for (int j = 0; j < 8 + i; j++) {
                           System.out.print("\b");
                       }
                   }
                   System.out.println("Saving>>>>>>>>>>>>>>>>>");
                   System.out.println("Saved");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }



           }


       }



   }

}





