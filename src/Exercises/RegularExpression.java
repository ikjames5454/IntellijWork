package Exercises;

import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TEnter the name:");
        String password = input.nextLine();
        if (password.length() > 8 && password.length() < 30){
            if (password.matches("[A-Za-z][A-Za-z0-9_]*")){
                System.out.println("valid");
            }
            else{
                System.out.println("invalid");
            }
        }
        else{
            System.out.println("name must be at least greater than eight and lesser than thirty");
        }

    }

}