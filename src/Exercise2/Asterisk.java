package Exercise2;

import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int numbers_1 = 0;
          int numbers_2 = 0;
          int numbers_3 = 0;
          int numbers_4 = 0;
          int numbers_5 = 0;
          int num = 0;
        while (num < 5 ){
                System.out.print("Enter the numbers 1 and 30:  ");
                 int numbers = input.nextInt();
                 if (numbers > 1 && numbers < 30){
                     if (num == 0){
                         numbers_1 = numbers;
                         num++;
                     }
                     else if (num == 1){
                         numbers_2= numbers;
                         num++;
                     }
                     else if (num == 2){
                         numbers_3 = numbers;
                         num++;
                     }
                     else if( num == 3){
                         numbers_4 = numbers;
                         num++;
                     }
                     else if (num == 4){
                         numbers_5 = numbers;
                         num++;
                     }

                 }




            }
            System.out.println("*".repeat(numbers_1));
        System.out.println("*".repeat(numbers_2));
        System.out.println("*".repeat(numbers_3));
        System.out.println("*".repeat(numbers_4));
        System.out.println("*".repeat(numbers_5));



        }

    }
