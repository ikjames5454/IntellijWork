package Strings;

import java.io.IOException;
import java.io.ObjectOutputStream;

import static java.lang.System.out;

public class ObjectSerialization {
    public static void main(String[] args)  {
       try{ ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            Account account = new Account("grace","20");
            objectOutputStream.writeObject(account);
       }catch (IOException e){
           out.println(e.getMessage());
           e.getStackTrace();

       }

    }
}
