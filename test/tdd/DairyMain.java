package tdd;

import Exercises.Entry;

import javax.swing.*;

public class DairyMain {
    private static String name;
    private static int myID;
    private static Diaries diaries = new Diaries();
    private static Diary activeDiary = null;

    public static void main(String[] args) {
        menu();


    }
    public static void menu(){
        try {
            displayMessage("WELCOME TO MY DIARY");
            mainMenu();
        }catch (Exception e){
            displayMessage("wrong action");
            menu();
        }

    }
    public static void mainMenu(){
        int mainMenu = Integer.parseInt(inputMethod("""
                welcome to my tatafo home
                1-> Register
                2->login
                3-> delete
                4-> exit
                """));
        switch (mainMenu){
            case 1 -> register();
            case 2 -> login();
            case 3 -> delete();
            case 4 -> leave();
            default -> mainMenu();
        }

    }

    private static void leave() {
        System.exit(1);
    }

    private static void delete() {
        try{
        String name = inputMethod("Enter UserName to delete");
         String password = inputMethod("Enter your password");
        diaries.delete(name,password);
            displayMessage("Diary successfully deleted");
            mainMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            mainMenu();
        }

    }

    private static void login() {
      try{
          String name = inputMethod("Enter your name");
        String passWords = inputMethod("Enter your password");
        diaries.findByUsername(name).unLock(passWords);
            entryMain();
        }catch (Exception e){
          displayMessage(e.getMessage());
          login();

      }
    }

    private static void register() {
        try{
         name = inputMethod("Enter a username");
        nameValidation(name);
        String password = inputMethod("create password");
        passWordValidation(password);
        diaries.add(name,password);
        String username = "Hello " + name;
        String pin = "your name and password has being created successfully";
        displayMessage(username);
        displayMessage(pin);
        mainMenu();
    }catch (Exception e){
            displayMessage("enter input properly");
            register();
        }
    }

    private static void entryMain() {
        int mainEntry = Integer.parseInt(inputMethod("""
                Welcome highly extinguish amibo guest
                1-> Create Entry
                2-> find Entry
                3-> Update Entry
                4-> Delete Entry
                5-> Log out
                """));
        switch (mainEntry){
            case 1 -> createEntry();
            case 2 -> findEntry();
            case 3 -> updateEntry();
            case 4 -> deleteEntry();
            case 5 -> logOut();
            default -> entryMain();
        }
    }

    private static void logOut() {
        int logout = Integer.parseInt(confirmMethod("Confirm whether you want to logout or not", String.valueOf(JOptionPane.YES_NO_OPTION)));
        if (logout == JOptionPane.YES_OPTION){
            displayMessage("you have logged out successfully, press ok to go back to mainMenu");
            mainMenu();
        }
        if (logout == JOptionPane.NO_OPTION){
            entryMain();
        }

    }

    private static void createEntry() {
        int entry = Integer.parseInt(inputMethod("""
                1-> Entry title and Entry body
                3-> Back to main entry
                """));
        switch (entry) {
            case 1 -> entryTitle();
            case 2 -> entryMain();
            default -> createEntry();
        }
    }
    public static void entryTitle(){
        try{
            String title = inputMethod("Enter title");
            validateTitle(title);
            String body = inputMethod("Enter body");
            int entryId = diaries.findByUsername(name).createEntry(title, body);
            new Entry(entryId,title,body);
            displayMessage("entry title and body created successfully");
            displayMessage("Title: " + title + "\n" + "Body: " + body);
            displayMessage("Your entry id is");
            displayMessage(String.valueOf(entryId));
            entryMain();
        }catch (Exception e){
            displayMessage(e.getMessage());
            entryTitle();
        }
    }

    private static void findEntry() {
        try{
        int entryID = Integer.parseInt(inputMethod("Enter your entry ID to find entry"));
        String entry = diaries.findByUsername(name).findEntry(entryID).getEntry();
            displayMessage("Entry found successfully");
            displayMessage(entry);
            entryMain();
        }catch (Exception e){
            displayMessage(e.getMessage());
            findEntry();
        }

    }


    private static void updateEntry() {
        try{
            myID = Integer.parseInt(inputMethod("Enter your entry ID to find entry"));
            String display = diaries.findByUsername(name).findEntry(myID).getEntry();
            displayMessage("Entry found successfully");
            displayMessage(display);
            int confirm = Integer.parseInt(confirmMethod("Do you still want to update", String.valueOf(JOptionPane.YES_NO_OPTION)));
            if (confirm == JOptionPane.YES_OPTION){
                updateEntry2();
            }
            }catch (Exception e){
            displayMessage(e.getMessage());
            updateEntry();
        }
    }
    private static void updateEntry2() {
        try {
            String newTitle = inputMethod("Enter new title to update");
            validateTitle(newTitle);
            String newBody = inputMethod("Enter new body to update");
            diaries.findByUsername(name).upDateEntry(myID, newTitle, newBody);
            String newDisplay = diaries.findByUsername(name).findEntry(myID).getEntry();
            displayMessage("Entry successfully updated");
            displayMessage(newDisplay);
            entryMain();
        }catch (Exception e){
            displayMessage(e.getMessage());
            updateEntry2();
        }
    }
    private static void deleteEntry() {
        int deleteID = Integer.parseInt(confirmMethod("Confirm whether you want to delete or not", String.valueOf(JOptionPane.YES_NO_OPTION)));
        if (deleteID == JOptionPane.YES_OPTION){
            deleteMethod();
        }
        if (deleteID == JOptionPane.NO_OPTION){
            entryMain();
        }
    }
    private static void deleteMethod() {
        try {
            int deleteID = Integer.parseInt(inputMethod("Enter your ID to delete "));
            String info = diaries.findByUsername(name).findEntry(deleteID).getEntry();
            displayMessage(info + "\n" + "delete in process");
            diaries.findByUsername(name).remove(deleteID);
            displayMessage("deleted successfully");
            entryMain();
        }catch (Exception e){
            displayMessage(e.getMessage());
            deleteEntry();
        }


    }
    public static String inputMethod(String input) {
        return JOptionPane.showInputDialog(null, input);
    }

    public static void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    public static String confirmMethod(String confirmInput, String yesORNo){
        return String.valueOf(JOptionPane.showConfirmDialog(null,confirmInput,yesORNo,JOptionPane.YES_NO_OPTION));
    }
    public static void nameValidation(String validation){
        String validate = "^[a-zA-Z ][a-zA-Z0-9]+$";
        if (!validation.matches(validate)){
            displayMessage("your name must start with alphabet");
            register();
        }
    }
    public static void passWordValidation(String password){
        String passwords = "^[a-zA-Z ][a-zA-Z0-9_]{8,15}+$";
        if (!password.matches(passwords)){
            displayMessage("your password must start with alphabet and must be within the range of 8 and 15, re-enter your password");
            register();
        }
    }
    public static void validateTitle(String entry){
        String title = "^[a-zA-Z ]+$";
    if (!entry.matches(title)) {
            createEntry();
        }
    }
}
