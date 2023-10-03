package tdd;

import javax.swing.*;

public class ContactAppMain {
    private static AppInfo contact = new AppInfo();
    private static PeopleInfoCapture capture = null;
    private static String username;

    public static void main(String[] args) {
        mainPage();

    }
    public static void mainPage(){
        try {
            displayMessage("     WELCOME");
            menu();
        }catch (Exception e){
            displayMessage("wrong action");
            mainPage();
        }
    }

    private static void menu() {
        int input = Integer.parseInt(inputMethod("""
                1->CreateUser
                2->Login
                3->DeleteUser
                4->Exit
                """));
        switch (input){
            case 1 : createUser();
            case 2 : login();
            case 3 : deleteUser();
            case 4 : exit();
            default:menu();
        }

    }

    private static void exit() {
        int option = Integer.parseInt(confirmMethod("are you sure you want to exit", String.valueOf(JOptionPane.YES_NO_OPTION)));
        if (option == JOptionPane.YES_OPTION){
            System.exit(1);
        }else {
            menu();
        }
    }

    private static void deleteUser() {
        try {
            String name = inputMethod("Enter your name");
            String password = inputMethod("Enter your password");
            contact.deleteEntry(name,password);
            displayMessage("user deleted successfully");
            menu();
        }catch(Exception e){
            displayMessage(e.getMessage());
            menu();
        }
    }

    private static void login() {
        try {
            String name = inputMethod("Enter your name to login");
            String password = inputMethod("Enter your password to login");
            contact.findEntry(name).unLockEntry(password);
            contactMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            login();
        }
    }
    private static void createUser() {
        try{
            String name = inputMethod("Enter a name");
            String password = inputMethod("Enter a password within 8 and 16");
            passWordValidation(password);
            contact.createEntry(name,password);
            username = name;
            displayMessage("name and password created successfully");
            menu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            createUser();
        }

    }

    private static void contactMenu() {
        int option = Integer.parseInt(inputMethod("""
                HELLO
                1->store Contact
                2->findContact
                3->Update Contact
                4->DeleteContact
                5->Logout
                """));
        switch (option){
            case 1 : storeContact();
            case 2 : findContact();
            case 3 : updateContact();
            case 4 : deleteContact();
            case 5 : logout();
            default: contactMenu();
        }
    }

    private static void storeContact() {
        try{
            String fullName = inputMethod("Enter contact full name");
            nameValidation(fullName);
            String address = inputMethod("Enter contact address");
            String telephoneNumber = inputMethod("Enter contact phone number");
            phoneNumberValidation(telephoneNumber);
            String email = inputMethod("Enter contact email");
            emailValidation(email);
            contact.findEntry(username).createEntry(fullName,address,telephoneNumber,email);
            displayMessage("contact stored successfully");
            contactMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            storeContact();

        }
    }

    private static void findContact() {
        try{
            String fullName = inputMethod("Enter contact name to find Contact");
            String display = contact.findEntry(username).findEntry(fullName).getInfo();
            displayMessage("contact found successfully");
            displayMessage(display);
            contactMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            findContact();
        }
    }

    private static void updateContact() {
        try{
            String fullName = inputMethod("Enter contact name to find Contact and update");
            String display = contact.findEntry(username).findEntry(fullName).getInfo();
            displayMessage("contact found successfully");
            displayMessage(display);
            updateContact2();
        }catch (Exception e){
            displayMessage(e.getMessage());
            updateContact();
        }
    }

    private static void updateContact2() {
        try{
            String fullName = inputMethod("Enter contact full name to update");
            nameValidation(fullName);
            String address = inputMethod("Enter contact address to update");
            String telephoneNumber = inputMethod("Enter contact phone number to update");
            phoneNumberValidation(telephoneNumber);
            String email = inputMethod("Enter contact email to update");
            emailValidation(email);
            contact.findEntry(username).updateEntry(fullName,address,telephoneNumber,email);
            String display = contact.findEntry(username).findEntry(fullName).getInfo();
            displayMessage("updated successfully");
            displayMessage(display);
            contactMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            updateContact2();

        }

    }
    private static void deleteContact() {
        try{
            String name = inputMethod("Enter username to delete");
            contact.findEntry(username).deleteEntry(name);
            displayMessage("contact deleted successfully");
            contactMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            contactMenu();
        }

    }

    private static void logout() {
        int option = Integer.parseInt(confirmMethod("are you sure you want to logout", String.valueOf(JOptionPane.YES_NO_OPTION)));
        if (option == JOptionPane.YES_OPTION){
            menu();
        }else{
            contactMenu();
        }
    }

    public static void passWordValidation(String password){
        String passwords = "^[a-zA-Z ][a-zA-Z0-9_]{8,16}+$";
        if (!password.matches(passwords)){
            displayMessage("your password must start with alphabet and must be within the range of 8 and 15, re-enter your password");
            createUser();
        }
    }
    public static void nameValidation(String password){
        String name = "^[A-Za-z ]+$";
        if (!password.matches(name)){
            displayMessage("your name must be alphabet only");
            storeContact();
        }
    }
    public static void phoneNumberValidation(String password){
        String name = "^0[0-9]{10}$";
        if (!password.matches(name)){
            displayMessage("your name must be alphabet only");
            storeContact();
        }
    }
    public static void emailValidation(String password){
        String name = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d@.]+$";
        if (!password.matches(name)){
            displayMessage("your name must be alphabet only");
            storeContact();
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
}
