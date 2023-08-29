package Exercise2;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class NameWorld {
    public static void main(String[] args) {
        number();
    }
    public static void number(){
        Scanner input = new Scanner(in);
        out.print("Enter a number between one and ten :");
        int num = input.nextInt();
        if ( num >= 1 && num <= 10){
            if (num == 1){
                out.println("One");
            }
            else if (num == 2){
                out.println("two");
            }
            else if (num == 3){
                out.println("three");
            }
            else if (num == 4){
                out.println("four");
            }
            else if (num == 5){
                out.println("five");
            }
            else if (num == 6){
                out.println("six");
            }
            else if (num == 7){
                out.println("seven");
            }
            else if (num == 8){
                out.println("eight");
            }
            else if (num == 9){
                out.println("Nine");
            }
            else if (num == 10){
                out.println("ten");
            }
        }
        else {
            out.println("must be between the range of one and ten");
            number();
        }
    }





    }

