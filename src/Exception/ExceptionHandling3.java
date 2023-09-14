package Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandling3 {
    public static void main(String[] args) throws Exception {
        String read = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        read = reader.readLine();

    }
}
