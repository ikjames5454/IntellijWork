package Chapter4;

import java.util.Scanner;

public class Mileage17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum_miles_gallons = 0;
        while (true){
            System.out.print("Enter the miles driven and gallons used: ");
            int driven = input. nextInt();
            int gallons = input.nextInt();

            if ( driven < 0){
                System.out.print("Invalid input,\n negative not required ");
                break;
            }
            double miles_gallons = (double)driven / gallons;
            System.out.printf("the miles per gallon for each input: %.2f\n",miles_gallons);

            sum_miles_gallons += miles_gallons;

        }
        System.out.println("\n" + sum_miles_gallons);
    }
}
