package ChibuzorAssignment;

import java.util.Scanner;

public class SchoolGrade {

    private static Scanner input = new Scanner(System.in);
    private  int numberOfStudent;
    private int numberOfSubject;
    private static String[][] scores;
    public static void main(String[] args) {
        SchoolGrade grade = new SchoolGrade();
        grade.numberOfStudents();

        System.out.println("=".repeat(grade.numberOfSubject * 10));
        grade.insert();
        grade.headerName();
        System.out.println();
        System.out.println("=".repeat(grade.numberOfStudent * 14));
        grade.bodyName();

    }
   public  void numberOfStudents(){
       System.out.println("Enter the number of student: ");
       int numberOfStudent = input.nextInt();
       if ( numberOfStudent > 0 && numberOfStudent < 100 ){
           this.numberOfStudent = numberOfStudent + 1;

       }
       else{
           System.out.println("invalid input, re-enter the number of student");
           numberOfStudents();

       }
       numberOfSubject();
   }
   public void numberOfSubject() {
       System.out.println("Enter the number of subject: ");
           int numberOfSubject = input.nextInt();
           if (numberOfSubject > 0 && numberOfSubject < 100) {
               this.numberOfSubject = numberOfSubject + 4;

           }
           else{
               System.out.println("invalid input, re-enter the number of subject");
               numberOfStudents();
           }
           saving();
           }

       public void collectNumberOfSubject(){
        String[][] scoresOfStudent = new String[numberOfStudent][numberOfSubject];
        for (int num = 1; num <= scoresOfStudent.length-1;num++){
            for (int count = 1; count <= scoresOfStudent[num].length-4; count++){
                System.out.println(" Entering Score for student" + " " + (num));
                System.out.println(" Enter score for subject" + " " + (count));
                int scoreInput = input.nextInt();
                if (scoreInput > 0 && scoreInput < 100){
                    scoresOfStudent[num][count] = String.valueOf(scoreInput);

                }
                else{
                    System.out.println("invalid input, re-enter the number of subject");
                    collectNumberOfSubject();


                }
                int timer = 150;
                int nums = 17;

                try {
                    for (int i = 0; i < nums; i++) {
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


        scores = scoresOfStudent;



       }
    public void saving(){
        int timer = 150;
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
        collectNumberOfSubject();
    }

       public void headerName(){
        for (int index = 0; index < scores[0].length; index++){
            System.out.printf("%10s", scores[0][index]);
        }
       }

       public void bodyName() {
           for (int index = 1; index < scores.length; index++) {
               for (int indice = 0; indice < scores[index].length; indice++) {
                   System.out.printf("%10s", scores[index][indice]);
               }
               System.out.println();
           }
       }
           public void insert(){
               scores[0][0] = "student";
               for (int index = 1; index < numberOfSubject; index++){
                   scores[0][index] = "sub" + index;

               }
               for (int index = 1; index < numberOfStudent; index++){
                   scores[index][0] = "student" + index;
               }
               scores[0][numberOfSubject-3] = "Total";
               scores[0][numberOfSubject-2] = "AVG";
               scores[0][numberOfSubject -1] = "position";
           }

       }




