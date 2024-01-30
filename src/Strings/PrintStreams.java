package Strings;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreams {
    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream(System.out)) {
            printStream.println("hello");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try{
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
            System.out.println("i am tired");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }



    }
}
