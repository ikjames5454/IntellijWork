package Chapter5;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i += 1;
        }
        int value = -5;
        switch (value) {
            case -5:
                System.out.println("Negative");
                break;
            case 0:
                System.out.println("Zero");
        }


        for (int x = 19; x > 1; x -= 1) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
        int counter = 0;
        do {
            System.out.println(counter + 1);
            counter += 2;
        } while (counter <= 51);

        System.out.println();
                Scanner s = new Scanner(System.in);
                for (int h = 1; h < 3; h++) {
                    for (int j = 1; j < 5; j++)
                        System.out.print('*');
                    System.out.println("\n#####");
                }





    }






}
