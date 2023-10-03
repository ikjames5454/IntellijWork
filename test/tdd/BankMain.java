package tdd;

import javax.swing.*;
import java.util.Objects;

public class BankMain {
    private static final Bank bank = new Bank("UBA");
    private Accounts accounts = null;
    private static String userName;
    private static String password;
    private static String accountNumber;
    private static String myPin;
    

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        try {
            displayMessage("Welcome to UBA banking APP");
            mainMenu();
        } catch (Exception e) {
            displayMessage(String.valueOf(e));
            menu();
        }
    }

    public static void mainMenu() {
        int option = Integer.parseInt(inputMethod("""
                1-> CreateUser
                2-> Login
                3-> exit
                """));
        switch (option) {
            case 1 -> createAccountUser();
            case 2 -> login();
            case 3 -> System.exit(1);
            default -> mainMenu();
        }

    }

    private static void login() {
        String name = inputMethod("enter your username");
        if (Objects.equals(name, userName)) {
            login2();
        } else {
            displayMessage("wrong name, enter the right name");
            login();
        }
    }

    private static void login2() {
        String passwords = inputMethod("enter your password");
        if (Objects.equals(passwords, password)) {
            bankMenu();
        } else {
            displayMessage("wrong password, try again later");
            login2();
        }
    }

    private static void createAccountUser() {
        userName = inputMethod("Enter name to create username");
        password = inputMethod("Enter a password of 8 or more characters");
        if (password.length() >= 8) {
            displayMessage(userName + " " + "your names and password created successfully");
            mainMenu();
        } else {
            displayMessage("invalid password, it must be 8 or more");
            createAccountUser();
        }
    }

    public static void bankMenu() {
        int option = Integer.parseInt(inputMethod("""
                    Welcome extinguish customer
                1->Register
                2->FindAccount
                3->CheckBalance
                4->CanTransfer
                5->Deposit
                6->withdraw
                7->logout
                """));
        switch (option) {
            case 1 -> register();
            case 2 -> findAccount();
            case 3 -> checkBalance();
            case 4 -> canTransfer();
            case 5 -> deposit();
            case 6 -> withdraw();
            case 7 -> logout();
            default -> bankMenu();
        }

    }

    private static void logout() {
        int option = Integer.parseInt(confirmMethod("are really sure you want to logout", String.valueOf(JOptionPane.YES_NO_OPTION)));
        if (option == JOptionPane.YES_OPTION){
            mainMenu();
        }if (option == JOptionPane.NO_OPTION){
            bankMenu();
        }
    }

    private static void register() {
        try {
            String firstName = inputMethod("Enter firstname");
            String secondName = inputMethod("Enter second name");
            String pin = inputMethod("Enter pin");
            accountNumber = bank.canRegister(firstName, secondName, pin);
            String fullName = firstName + secondName;
            new Accounts(accountNumber,fullName,pin);
            displayMessage("you have being registered successfully");
            displayMessage("name: " + firstName + " " + secondName + "\n" + "pin: " + pin);
            displayMessage("your account number is");
                displayMessage(accountNumber);
                myPin = pin;
                bankMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            register();
        }

    }

    private static void findAccount() {
        try {
            String findAccount = inputMethod("Enter account number to find account");
                String display = bank.findAccountNumber(findAccount).canGetAccount();
                displayMessage("account found successfully");
                displayMessage(display);
                bankMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            findAccount();
        }

    }

    private static void checkBalance() {
        try{
            String checkBalance = inputMethod("Enter a account number to check balance: ");
           bank.findAccountNumber(checkBalance);
           String pin = inputMethod("Enter pin to checkBalance");
           double amount = bank.findAccountNumber(checkBalance).checkBalance(pin);
           displayMessage("your balance is: " + amount);
           bankMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            checkBalance();
        }
        }



    private static void deposit() {
        try {
            String enter = inputMethod("Enter account number to deposit: ");
                bank.findAccountNumber(enter).canGetAccount();
                depositAmount();

        }catch (Exception e){
            displayMessage(e.getMessage());
            deposit();

        }
    }

    private static void canTransfer() {
        try{
            String pin = inputMethod("Enter your account pin");
            String receiver = inputMethod("Enter the account number of the reciever");
            String sender = inputMethod("Enter the account number of the sender");
            double amount = Double.parseDouble(inputMethod("Enter the amount you want to transfer"));
            bank.canTransfer(amount,sender,receiver,pin);
            displayMessage(amount + " transferred successfully");
            bankMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            canTransfer();
        }

    }
    private static void depositAmount(){
        try {
            int amount = Integer.parseInt((inputMethod("Enter amount to be entered")));
                bank.canDeposit(amount, accountNumber);
                displayMessage(amount + " deposited successfully");
                bankMenu();

        }catch (Exception e){
            displayMessage(e.getMessage());
            depositAmount();

        }

        }


    private static void withdraw() {
        try {
            String accountNumbers = inputMethod("Enter account to withdraw");
            bank.findAccountNumber(accountNumbers).canGetAccount();
            withdraw1();
        }catch (Exception e){
            displayMessage(e.getMessage());
        }
    }

    private static void withdraw1() {
        try {
            String pin = inputMethod("Enter pin to withdraw");
            bank.checkBalance(accountNumber,pin);
            withdraw2();
        }catch (Exception e){
            displayMessage(e.getMessage());
            withdraw1();

        }
    }

    private static void withdraw2() {
        try {
            int amount = Integer.parseInt(inputMethod("Enter the amount you want to"));
            bank.canWithdraw(amount, accountNumber, myPin);
            displayMessage("you succesfully withdrawed " + amount);
            bankMenu();
        }catch (Exception e){
            displayMessage(e.getMessage());
            withdraw2();
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
