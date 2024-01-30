package Strings;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilesReader {
    public static void main(String[] args) {
        try( var fileOutputStream = new FileOutputStream("semicolon.txt")) {
            String sentence = "i am tired";
            fileOutputStream.write(sentence.getBytes());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
