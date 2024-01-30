package Strings;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNio {
    public static void main(String[] args) {
        String location = "c:\\Users\\semicolon\\Documents\\test.txt";
        Path path = Paths.get(location);
        try(OutputStream outputStream = Files.newOutputStream(path)){
            outputStream.write("semicolon".getBytes());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
