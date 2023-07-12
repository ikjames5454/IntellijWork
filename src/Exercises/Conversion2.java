package Exercises;

import java.util.Scanner;

public class Conversion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet");
        double feet = input.nextDouble();

        double oneFootInMeters = 0.305;
        double multipleFootInMeters = feet * oneFootInMeters;
        System.out.printf("%.1f feet is %.4f meters",feet,multipleFootInMeters);
        //conversion of feet into meters
    }
}
