package Exercise2;

import java.util.Scanner;

import static java.lang.System.*;

public class nameEntry {
    public static void main(String[] args) {
        nameCollector();
    }

    public static void nameCollector() {
        Scanner input = new Scanner(in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        if (name.matches("^[a-zA-Z ]+$")) {
            out.println("Hello " + name);
        } else {
            out.println("your name can not be a number or special character");
            nameCollector();
        }
    }
}

