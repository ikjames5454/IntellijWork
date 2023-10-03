package tdd;

import java.util.Objects;

public class Accounts {
    private double balance;
   private String PIN;
   private String accountNumber;
   private String accountName;
    private Object account;

    public Accounts(String accountNumber, String accountName, String pin){
        PIN = pin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }


    public double checkBalance(String pin) {
        validation(pin);
        return balance;
    }
    public void validation(String pin) {
        if (!Objects.equals(PIN, pin)) {
            throw new NullPointerException("wrong pin");
        }
    }

    public void deposit(double amount) {
        if ( amount > 0 ) {
            balance = balance + amount;
        }
        else {
            throw new NullPointerException("invalid amount");
        }


    }


    public void withDraw(double amount,String pin) {
        validation(pin);
        if ( amount > 0 ){
            if ( amount < balance) {
                    balance = balance - amount;

            }
            else {
                throw new NullPointerException("insufficient balance");
            }
        }
        else {
            throw new NullPointerException("invalid amount");
        }
    }

    public String canGetAccount() {

        return "AccountName: " + accountName + "\n" + "AccountNumber" + accountNumber + "\n" + "Pin: " + PIN;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String canChangePin(String oldPin, String newPin) {
        if (this.PIN.equals(oldPin)){
            this.PIN = newPin;
        }
        return newPin;

    }
}
