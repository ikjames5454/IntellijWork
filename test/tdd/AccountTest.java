package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class AccountTest {
    @Test
    public void canDepositInToAccountTest() {
        Account estherAccount = new Account("7777");
        int currentBalance = estherAccount.getBalance("7777");
        assertEquals(0, currentBalance);
        estherAccount.deposit(5000);
        int newBalance = estherAccount.getBalance("7777");
        assertEquals(5000, newBalance);

    }
@Test
    public void canDepositThreeThousandInToAccountTest(){
    Account estherAccount = new Account("7777");
    estherAccount.deposit(3000);
    int currentBalance = estherAccount.getBalance("7777");
    assertEquals(3000,currentBalance);
    estherAccount.deposit(3000);
    int newBalance = estherAccount.getBalance("7777");
    assertEquals(6000,newBalance);
}
@Test
    public void canDepositMultipleTimeInToAccountTest(){
        Account estherAccount = new Account("7777");
        estherAccount.deposit(5000);
        int currentBalance = estherAccount.getBalance("7777");
        assertEquals(5000,currentBalance);
        estherAccount.deposit(10000);
        estherAccount.deposit(8000);
        int newBalance = estherAccount.getBalance("7777");
        assertEquals(23000,newBalance);

}
@Test
    public void canDepositNegativeAmountTest(){
    Account estherAccount = new Account("7777");
    estherAccount.deposit(7000);
    int currentBalance = estherAccount.getBalance("7777");
    assertEquals(7000,currentBalance);
    estherAccount.deposit(-3000);
    int newBalance = estherAccount.getBalance("7777");
    assertEquals(7000,newBalance);
}
@Test
    public void canWithdrawMoneyFromAccount(){
        Account estherAccount = new Account("7777");
        estherAccount.deposit(8000);
        int currentBalance = estherAccount.getBalance("7777");
        assertEquals(8000,currentBalance);
        estherAccount.withdraw(3000,"7777");
        int newBalance = estherAccount.getBalance("7777");
        assertEquals(5000,newBalance);
}
@Test
    public void canWithdrawNegativeAmountFromAccount(){
        Account estherAccount = new Account("7777");
        estherAccount.deposit(15000);
        int currentBalance = estherAccount.getBalance("7777");
        assertEquals(15000,currentBalance);
        estherAccount.withdraw(-4000,"7777");
        int newBalance = estherAccount.getBalance("7777");
        assertEquals(15000,newBalance);

}
@Test
    public void canWithdrawAboveTheBalanceFromAccount(){
        Account estherAccount = new Account("7777");
        estherAccount.deposit(9000);
        int currentBalance = estherAccount.getBalance("7777");
        assertEquals(9000,currentBalance);
        estherAccount.withdraw(11000,"7777");
        int newBalance = estherAccount.getBalance("7777");
        assertEquals(9000,newBalance);


}
@Test
    public void canWithDrawWithPin(){
    Account estherAccount = new Account("7777");
    estherAccount.deposit(12000);
    int currentBalance = estherAccount.getBalance("7777");
    assertEquals(12000,currentBalance);
    estherAccount.withdraw(7000,"7777");
    int newBalance = estherAccount.getBalance("7777");
    assertEquals(5000,newBalance);

}
}

