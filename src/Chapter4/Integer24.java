package Chapter4;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass = 0;
        int failure = 0;
        while(true){
            System.out.println("Enter the number ( 1 or 2 as sentinel): ");
            int numbers = input.nextInt();
            if(numbers == 1 || numbers == 2){
                break;
            }
            if(numbers == 4){
                pass = pass + 1;
            }
            else{
                failure = failure + 1;

            }



        }
        System.out.println("The student that passed are: "+ pass + "\n");
        System.out.println("The student that failed are: "+failure + "\n");

    }
}
