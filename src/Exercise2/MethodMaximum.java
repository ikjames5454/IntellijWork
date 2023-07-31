package Exercise2;

import java.util.Scanner;

public class MethodMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three numbers to determine: ");
        int numbers = input.nextInt();
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int maximumValue = maximumNumber(numbers,number1,number2);
        int minimumValue = minimumNumber(numbers,number1,number2);

        System.out.println("the maximum number is: " + maximumValue);
        System.out.println("the minimum number is: " + minimumValue);


    }
    public static int maximumNumber(int x,int y,int z){
        int maximum = x;
        if (y > maximum){
            maximum = y;
        }
        if (z > maximum){
            maximum = z;
        }
        return maximum;
    }

    public static int minimumNumber(int x,int y,int z){
        int minimum = x;
        if (y < minimum){
            minimum = y;
        }
        if (z < minimum) {
            minimum = z;
        }
        return minimum;
    }

}
