package Exercise2;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        threeDimension();

    }
    public static void threeDimension(){
        int[][] number = new int[3][7];
        Scanner input = new Scanner(System.in);
        for(int num = 0; num < number.length;num++){
            for (int numbers = 0; numbers < number[num].length;numbers++){
                System.out.println("Enter the number: ");
                int integer = input.nextInt();
                number[num][numbers] = integer;

            }
        }

    }
}
