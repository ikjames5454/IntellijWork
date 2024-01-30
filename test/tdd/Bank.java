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


    public String canRegister(String firstName, String secondName, String pin) {
        String accountName = firstName + " " + secondName;
        String accountNumber = generateAccountNumber();
        Accounts accounts = new Accounts(accountNumber,accountName,pin);
        account.add(accounts);
        return accountNumber;
    }

    public String generateAccountNumber(){
//      return "6" + (int) (Math.random() * 100000) + (int) (Math.random() * 10000) ;
       return account.size() + 1 + "";

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

            findAccountNumber(accountNumber).deposit(amount);

    }

    public double checkBalance(String accountNumber, String pin) {
        return findAccountNumber(accountNumber).checkBalance(pin);
    }

    public void canWithdraw(int amount, String accountNumber, String pin) {
            findAccountNumber(accountNumber).withDraw(amount,pin);
    }

    public void canTransfer(double amount,String fromAccount,String toAccount, String pin) {
        findAccountNumber(fromAccount).withDraw( amount,pin);
        findAccountNumber(toAccount).deposit(amount);

    }
}
