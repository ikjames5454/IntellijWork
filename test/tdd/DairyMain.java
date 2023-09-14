package tdd;

import javax.swing.*;
import java.util.Objects;


public class DairyMain {
    private static String name;
    private static String password;
    private static String token;
    private static String title;
    private final static Diary diary = new Diary("Ikenna james","1234");
    private final static Diaries dairies = new Diaries();

    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        displayMessage("WELCOME TO MY DIARY");
        menu();

    }
    public static void menu(){
        int input = Integer.parseInt(inputMethod("""
                1.create a DiaryAccount
                2.lockDairy
                3.UnlockDairy
                """));
        if (input == 1){
            createDiaryAccount();
        }
        if (input == 2){
            lockDairy();
        }
        if (input == 3){
            unlockDairy();
        }else {
            menu();
        }



    }

    private static void createDiaryAccount() {
        name = inputMethod("Enter a username");
        password = inputMethod("create password");
        dairies.add(name,password);
        System.out.println();
        String username = "Hello " + name;
        String pin = "your name and password has being created successfully";
        displayMessage(username);
        displayMessage(pin);
        menu();
    }
    private static void lockDairy(){
        token = diary.lockDiary();
        displayMessage("your token is " + token + " your dairy is now lock");
        menu();
    }

    private static void unlockDairy(){
        String pin = inputMethod("Enter token");
        if (Objects.equals(pin, token)){
            displayMethod();
        }else{
            displayMessage("wrong token");
            lockDairy();
        }




    }





    public static void displayMethod() {
        int userInput = Integer.parseInt(inputMethod("""
                1.Create Entry
                2.find Entry
                3.Update Entry
                4.Delete Entry
                """));
        if (userInput == 1){
            createEntry();
        }
        if (userInput == 2){
            findEntry();
        }
        if (userInput == 3){
            updateEntry();
        }
        if (userInput == 4){
            deleteEntry();
        }



    }

    private static void createEntry() {
         String option = inputMethod("1.Title" + "\n" +
                "2.Back");
        if (Objects.equals(option, "2")) {
            displayMethod();
        }
        if (Objects.equals(option, "1")){
            title = inputMethod("Enter the title");
            createEntry2();
        }
        else {
            createEntry();
        }

    }
    private static void createEntry2() {

            String body = inputMethod("1.Enter the body" + "\n" + "2.back");
            if (Objects.equals(body, "2")) {
                createEntry();
            }
            diary.entry(title, body);
            displayMessage("Your entry has being created successfully");
            displayMessage("Title: " + title + "\n" + "Body: " + body);
            displayMethod();
        }





    private static void findEntry(){

    }
    private static void updateEntry(){

    }
    private static void deleteEntry(){

    }

    public static String inputMethod(String input) {
        return JOptionPane.showInputDialog(null, input);
    }

    public static void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message);


    }
}
