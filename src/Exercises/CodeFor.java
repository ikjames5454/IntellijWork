package Exercises;

public class CodeFor {
    public static void main(String[] args) {
        int sum = 0;
        int multiples = 1;
        for(int a = 4;a < 10;  a+=4) {
            for (int b = 1; b < 6; b++) {
                multiples *= a;
                sum = sum + multiples;

               System.out.print(multiples + " " );

            }
//            System.out.print( sum + " ");
            multiples = 1;
//            sum = 0;
        }
       System.out.print("\n" + sum);
    }


}

