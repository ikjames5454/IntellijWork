package Exercises;

public class Amount {
    public static void main(String[] args) {
        System.out.println("each year" + "\t\t\t\t" + "amount" + "\t\t\t\t\t" + "sums");
     int p = 1000;
     double r = 0.05;
     double sum = 0;
     double average = 0;
     for (int n = 1; n <= 10; n++){
         double a = p * Math.pow(( 1 + r),n);
         sum = sum + a;
         System.out.printf("%-2d years %,22.2f %,22.2f \n",n,a,sum);
          average = sum / n;

     }
        System.out.printf("\nThe average is: %.2f",average);
        System.out.printf("\nThe sum total: %.2f",sum);


     System.out.println();
    }
}
