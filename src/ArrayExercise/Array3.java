package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for ( int a = 0; a < arr.length; a++){
            arr[a] = (1 + a) * 3;
        }
        System.out.println(Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        boolean found = false;
        for ( int b = 0; b < arr.length; b++){
            if (arr[b] == num){
                System.out.println("the index of the number: " + b);
                found = true;
                break;
            }

            }
        if (!found){
            System.out.println("number not found");
        }


        }

    }

