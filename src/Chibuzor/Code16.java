package Chibuzor;

public class Code16 {
    public static void main(String[] args) {
        int age = 60;
        if (age >= 65) {
            System.out.print("age is  equal  or greater than 65");

        } else {
            System.out.print("age is not equal or greater than 65 \n");
        }
        int y = 0;
        int x = 0;
        int total = 0;
        while (x < 10) {
            total += x;
            x++;
            System.out.println(x);


        }
        System.out.println("\n" + total);
        x = 0;
        while (x <= 100) {
            total += x;
            ++x;

        }
        System.out.println("\n" + total);




    }

    }
