package tdd;

import java.util.Objects;

public class Account {
    private int balance;
private final String PINDIGIT;
    public Account(String pin) {
        this.PINDIGIT = pin;
    }

    public int getBalance(String pin) {
        if (!Objects.equals(PINDIGIT, pin)) return 0;
        return balance;

    }


    public void deposit(int amount) {
        if ( amount > 0) {
            balance = balance + amount;
        }
        }

    public void withdraw(int amount,String pin) {
        if( amount > 0) {
            if (amount < balance) {
                if (Objects.equals(PINDIGIT, pin)) {
                    balance = balance - amount;
                }
            }
        }
    }
}
