package Exercises;

import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        int length = input.nextInt();
        double pie = 3.142;
        double area = radius * radius * pie;
        double volume = area * length;
        System.out.printf("The area is %.4f%n", area);
        System.out.printf("The volume is %.1f", volume);

    }
}
