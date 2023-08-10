package Enum;

import java.util.Scanner;

public class GeoPoliticalZonesTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter State to getZone ");
        String userInput = scanner.nextLine();

        System.out.println("Your zone is " + GeoPoliticalZones.getZone(userInput));
    }



}
