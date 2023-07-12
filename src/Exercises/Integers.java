package Exercises;

public class Integers {
    public static void main(String[] args) {
        int sum = 0;
        for (int q = 0; q < 30; q++) {
            if (q % 3 == 0){
                sum = sum + q;

            }

        }


        System.out.println("The sum of numbers divisible by three between 1 and 30 is =" + sum);
    }
}