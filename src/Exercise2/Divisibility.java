package Exercise2;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        if ( integer % 5 == 0 && integer %  6 == 0){
            System.out.printf("is %d divisible by 5 and 6?",integer);
            System.out.println(true);
        }
        else{
            System.out.printf("is %d divisible by 5 and 6?",integer);
            System.out.println("\t" + false);

        }
        if (integer % 5 == 0 || integer % 6 == 0){
            System.out.printf("is %d divisible by 5 or 6?",integer);
            System.out.println("\t" + true);
        }
        else{
            System.out.printf("is %d divisible by 5 or 6?",integer);
            System.out.println("\t" + false);
        }
        if (integer % 5 == 0 ^ integer % 6 == 0){
            System.out.printf("is %d divisible by 5 or 6, but not both?",integer);
            System.out.println("\t" + true);
        }
        else{
            System.out.printf("is %d divisible by 5 or 6, but not both?",integer);
            System.out.println("\t" + false);
        }
    }
}
