package ChibuzorAssignment;

import java.util.Scanner;

public class SchoolManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Lagbaja Schools' Grade Management System!");

        int numStudents = getNumberFromUser("Enter the number of students: ", scanner);
        int numSubjects = getNumberFromUser("Enter the number of subjects: ", scanner);

        int[][] scores = getScoresFromUser(numStudents, numSubjects, scanner);

        displayClassSummary(scores);

        scanner.close();
    }

    public static int getNumberFromUser(String prompt, Scanner scanner) {
        while (true) {
            try {
                System.out.print(prompt);
                int number = Integer.parseInt(scanner.nextLine());
                if (number < 1) {
                    System.out.println("Please enter a number greater than 0.");
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static int[][] getScoresFromUser(int numStudents, int numSubjects, Scanner scanner) {
        int[][] scores = new int[numStudents][numSubjects];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter scores for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                while (true) {
                    try {
                        System.out.print("Enter score for Subject " + (j + 1) + ": ");
                        int score = Integer.parseInt(scanner.nextLine());
                        if (score >= 0 && score <= 100) {
                            scores[i][j] = score;
                            break;
                        } else {
                            System.out.println("Score must be between 0 and 100.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid score.");
                    }
                }
            }
        }
        return scores;
    }

    public static void displayClassSummary(int[][] scores) {
        System.out.println("\nClass Summary:");
        for (int i = 0; i < scores.length; i++) {
            int[] studentScores = scores[i];
            double averageScore = calculateAverage(studentScores);
            System.out.print("Student " + (i + 1) + ": Scores: ");
            for (int j = 0; j < studentScores.length; j++) {
                System.out.print(studentScores[j]);
                if (j < studentScores.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(", Average: " + String.format("%.2f", averageScore));
        }
    }

    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}


