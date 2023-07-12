package Exercise2;

import java.util.Scanner;

public class Conversion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius");
        int celsius = input.nextInt();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.printf("%d Celsius is %.1f Fahrenheit", celsius,fahrenheit);
    }
}
