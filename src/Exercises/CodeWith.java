package Exercises;

public class CodeWith {
    public static void main(String[] args) {


            int sum = 0;
            int multiples = 1;
            for (int a = 4; a < 5; a ++) {
                for (int b = 1; b < 6; b++) {
                    multiples *= a;
                    sum = sum + multiples;


                    System.out.print(multiples + " ");


                }



                System.out.println();
            }
            int sum1 = 0;
            int multiple = 1;
            for (int a = 8; a < 9; a++){
                for (int c = 1; c < 6; c++){
                    multiple *= a;
                    sum1 = sum1 + multiple;

                    System.out.print(multiple + " ");



                }
            }
            System.out.print("\n" + sum);
            System.out.print("\n" + sum1);



    }

}


