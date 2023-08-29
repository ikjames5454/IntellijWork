package Hackerthon;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = input.nextLine();
        if (name.matches(NameValidation.regularExpression)){
            System.out.println("Valid");
        }
        else {
            System.out.println("invalid");
            System.out.println("name must be at least greater than eight and less than twenty nine and must begin with upper or lower case character and atleast number and underscore");
        }
    }
}
