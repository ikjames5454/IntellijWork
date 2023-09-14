package Exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] a = new int[4];
        int k;
        int m = 0;
        int n = 8;
        try {
            k = n / m;
            System.out.println(k);

            for (int i = 0; i <= a.length; i++){
                a[i] = i + 1;
            }
            for (int c : a){
                System.out.println(a);
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bound");
        }
        catch (ArithmeticException e){
            System.out.println("not divisible by zero");
        }




    }
}
