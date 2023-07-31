package Exercise2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacters {
    public static void main(String[] args) {
        specialCharacters();

    }
    public static boolean specialCharacter(String special){
        Pattern myPattern = Pattern.compile("[^a-zA-Z0-9] ");
        Matcher characters = myPattern.matcher(special);
        return characters.find();


    }
    public static void specialCharacters(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the special character");
            String character = input.nextLine();
            if (specialCharacter(character)){
                System.out.println("does not contain special character");
            }else {
                System.out.println("contain a special character");
            }




    }
}
