package Chapter5;

public class Exercise3 {
    public static void main(String[] args) {
            int i = 1;
            while (i <= 10){
                System.out.print( i + " " );
                ++i;
            }
            System.out.println();
            for (double k = 0.1; k <= 1.0; k += 0.1) {
                System.out.printf("%.1f  ", k );
            }
            System.out.println();
            int n = 3;

            switch (n) {
                case 1:
                    System.out.println("The number is 1");
                    break;
                case 2:
                    System.out.println("The number is 2");
                    break;
                default:
                    System.out.println("The number is not 1 or 2");
                    break;
            }
            System.out.println();
            int x = 1;
            while (x < 10) {
                System.out.print(x++ + " ");
            }
        }
    }

