package Exercise2;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the a character to check: ");
        String characters = input.nextLine();

        String newString = String.valueOf(specialCharacters(characters));
        System.out.println(newString);

    }

    public static boolean specialCharacters(String characters){
        boolean checkSpecialCharacters = false;
        for( int index = 0; index < characters.length(); index++){
            if (characters.charAt(index) == '#' || characters.charAt(index) == '$' || characters.charAt(index) == '%'||
                    characters.charAt(index) == '-'|| characters.charAt(index) == '_')
                checkSpecialCharacters = true;
        }
        return checkSpecialCharacters;

    }
}
