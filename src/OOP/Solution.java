package OOP;

import java.util.Scanner;

public class Solution {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            String number = input.nextLine();
            if ( Integer.parseInt(number) % 2 != 0){
                System.out.println("weird");
            }
            else if ( Integer.parseInt(number) % 2 == 0 &&  Integer.parseInt(number) >= 2 && Integer.parseInt(number) <= 5) {
                System.out.println("not weird");
            }
            else if  (Integer.parseInt(number) % 2 == 0 &&  Integer.parseInt(number) >= 6 && Integer.parseInt(number) <= 20) {
                System.out.println("weird");
            }
            else if ( Integer.parseInt(number) % 2 == 0 && Integer.parseInt(number) > 20){
                    System.out.println("not weird");
                }
            }

        }


