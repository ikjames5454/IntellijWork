package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class FileReaders {
    public static void main(String[] args) {
        try (
            var inputStreamReader = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(inputStreamReader)){
            System.out.println("Enter anything: ");
            String data = reader.readLine();
            System.out.println("you entered " + data);

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
//        char[] data = new char[533];
//        try(
//                FileReader fileReader = new FileReader()
//                )
    }
}
