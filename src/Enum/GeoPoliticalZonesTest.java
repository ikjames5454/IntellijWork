package Enum;

import java.util.Scanner;

import static java.lang.System.out;

public class GeoPoliticalZonesTest {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        try {
            out.print("Enter State to getZone ");
            String userInput = scanner.nextLine();
            out.println("Your zone is " + GeoPoliticalZones.getZone(userInput));
        } catch (Exception e) {
            out.println(e.getMessage());
            main();

        }
    }


        }





