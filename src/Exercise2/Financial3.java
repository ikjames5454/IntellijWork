package Exercise2;

import java.util.Scanner;

public class Financial3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight and price for package 1: ");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();
        System.out.print("Enter the weight and the price for package 2: ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();

        double priceOne = weight1 / price1;
        double priceTwo = weight2 / price2;

        if (priceOne > priceTwo){
            System.out.print("package 1 has a better price.");
        }
        else{
             System.out.print("package 2 has a better price.");
        }

    }
}
