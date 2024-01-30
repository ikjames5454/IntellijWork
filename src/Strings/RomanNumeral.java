package Strings;

import java.util.Scanner;

import static java.lang.System.in;

public class RomanNumeral {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.println("enter the number: ");
        int number = input.nextInt();
        System.out.println(romanFigure(number));

    }
    public static String romanFigure(int value){
        StringBuilder  string = new StringBuilder();
        if (value <= 1 || value > 40000) {
            throw new IllegalArgumentException("must be between 1 and 40000");

        }
        while (value >= 1000){
            string.append("M");
            value -= 1000;
        }
        while (value >= 900){
            string.append("DM");
            value -= 900;
        }
        while (value >= 500){
            string.append("D");
            value -= 500;
        }
        while (value >= 400){
            string.append("CD");
            value -= 400;
        }
        while (value >= 100){
            string.append("C");
            value -= 100;
        }
        while (value >= 90){
            string.append("XC");
            value -= 90;
        }
        while (value >= 50){
            string.append("L");
            value -= 50;
        }
        while ((value >= 40)){
            string.append("XL");
            value -= 40;
        }
        while (value >= 10){
            string.append("X");
            value -= 10;
        }
        while (value == 9){
            string.append("IX");
            value -= 9;
        }
        while (value >= 5){
            string.append("V");
            value -= 5;
        }
        while (value == 4){
            string.append("IV");
            value -= 4;
        }

        while (value >= 1){
            string.append("I");
            value -= 1;
        }
        return string.toString();

    }
}
