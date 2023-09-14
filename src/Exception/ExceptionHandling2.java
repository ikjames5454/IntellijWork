package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int j = 8;
        int m = 1;
        int i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("enter a number: ");
            m = Integer.parseInt(reader.readLine());
            i = j /m;
            System.out.println(i);
        }catch (IOException e){
            System.out.println("io exception");
        }catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        }catch (NumberFormatException e){
            System.out.println("string instead of int");
        }finally {
            System.out.println("bye");
        }

    }
}
