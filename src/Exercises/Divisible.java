package Exercises;

public class Divisible {
    public static void main(String[] args) {
        int sum = 0;
        int q = 0;
        while (q < 30){
            if (q % 3 == 0){
                sum = sum + q;
            }
            q++;



        }
        System.out.println("the sum is =" + sum);
    }
}
