package tdd;

public class Accounts {
    private double balance;
   private String PIN;
   private String accountNumber;
   private String accountName;
    private Object account;

    public Accounts(String accountNumber, String accountName, String pin){
        this.PIN = pin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }


    public double checkBalance(String pin) {
        validation(pin);
        return balance;
    }
    public void validation(String pin){
        if (this.PIN != pin) throw new NullPointerException("wrong pin");

    }

    public void deposit(int amount) {
        if ( amount > 0 ) {
            balance = balance + amount;
        }

    }


    public void withDraw(double amount,String pin) {
        if ( amount > 0 ){
            if ( amount < balance) {
                    balance = balance - amount;

            }
        }
    }

    public String canGetAccount() {

        return accountNumber + " " + accountName + " " +PIN;
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
