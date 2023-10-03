package strings;

import java.util.Scanner;

public class Input {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your first name: ");
        String secondName = input.nextLine();
        System.out.println("Enter your first name: ");
        String thirdName = input.nextLine();
        System.out.println(firstName.toUpperCase().charAt(0) + "." + secondName.toUpperCase().charAt(0) + "." + thirdName);


    }
}