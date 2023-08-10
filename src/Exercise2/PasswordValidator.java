package Exercise2;

import java.util.Scanner;

public class PasswordValidator {
    private String passwords;
    private final  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        PasswordValidator validate = new PasswordValidator();
        validate.collectInput();

    }
    public void collectInput() {
        System.out.println("Enter a valid password: ");
         passwords = input.nextLine();
        if (passwords.length() < 8) {
            System.out.println("your password must be at least greater than 8");
            collectInput();
        }
        checkUppercase();
    }
        public void checkUppercase(){
        if (passwords.matches(".+[A-Z].+")){
            checkLowercase();
        }
        else {
            System.out.println("your password must contain at least one uppercase character");
            collectInput();

        }
        }
            public void checkLowercase(){
        if (passwords.matches(".+[a-z].+")) {
            checkNumbers();
        }
        else{
            System.out.println("your password must contain at least one lowercase character");
            collectInput();
        }
        }
        public void checkNumbers(){
        if(passwords.matches(".+[0-9].+")){
            checkSpecialCharacters();
        }
        else{
            System.out.println("your password must contain at least one number character");
            collectInput();
        }
        }
        public void checkSpecialCharacters(){
        if (passwords.matches(".*[!@#$%^&*()_+ \\-={};':|,.<>/?].*")){
            System.out.println("valid password");
        }
        else {
            System.out.println("your password must contain at least one special character");
            collectInput();
        }
        savesPassword();
        }
        public void savesPassword (){
            System.out.println("Enter the password again to save: ");
            String validate = input.nextLine();
            while (!passwords.equals(validate)){
                System.out.println("Your password did,t march, try again to save your password");
                savesPassword();

            }
        savePassword();
    }
        public void savePassword(){
            int timer = 150;
            int num = 17;

            try {
                for (int i = 0; i < num; i++) {
                    System.out.print("Saving");
                    for (int j = 0; j <= i; j++) {
                        System.out.print(">");
                    }
                    Thread.sleep(timer);
                    for (int j = 0; j < 8 + i; j++) {
                        System.out.print("\b");
                    }
                }
                System.out.println("Saving>>>>>>>>>>>>>>>>>");
                System.out.println("password Saved");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        }







