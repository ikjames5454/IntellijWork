package tdd;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Accounts> account = new ArrayList<>();
     private String UBA;
     private String fullName;


    public Bank(String uba) {
        this.UBA = uba;
    }


    public void canRegister(String firstName, String secondName, String pin) {
        String accountName = firstName + " " + secondName;
        Accounts accounts = new Accounts(generateAccountNumber(),accountName,pin);
        account.add(accounts);

    }

    public String generateAccountNumber(){
        return account.size() + 1 + "";

    }


    public String getFullName() {
        return fullName;
    }

    public Accounts findAccountNumber(String accountNumber) {
        for (Accounts accounts : account ) {
            if (accounts.getAccountNumber().equals(accountNumber)){
                return accounts;
            }
        }
        throw new IllegalArgumentException("input a valid Account");
    }


    public void canDeposit(int amount,String accountNumber) {
        if ( amount > 0 ){
            findAccountNumber(accountNumber).deposit(amount);
        }
    }

    public double checkBalance(String accountNumber, String pin) {
        return findAccountNumber(accountNumber).checkBalance(pin);
    }

    public void canWithdraw(int amount, String accountNumber, String pin) {
        if ( amount > 0){
            findAccountNumber(accountNumber).withDraw(amount);
        }
    }
}
