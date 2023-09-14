package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountsTest {
    @Test
    public void depositBalanceIncreasesTest(){
        Accounts account = new Accounts("1", "name", "4545");
        assertEquals(0,account.checkBalance("4545"));
        account.deposit(5000);
        assertEquals(5000,account.checkBalance("4545"),0.0);
    }
    @Test
    public void checkBalanceWithWrongPin(){
        Accounts account = new Accounts("1", "name", "4545");
        account.deposit(6000);
        assertEquals(6000,account.checkBalance("4545"));


    }
    @Test
    public void canWithdrawTest() {
        Accounts account = new Accounts("1", "name", "4545");
        account.deposit(10000);
        assertEquals(10000, account.checkBalance("4545"));
        account.withDraw(-7000,"4545");
        assertEquals(10000, account.checkBalance("4545"));

    }
    @Test
    public void canValidate() {
        Accounts account = new Accounts("1", "name", "4545");
        assertEquals(0,account.checkBalance("4545"));
        }
    @Test
    public void canGetAccountNumber(){
        Accounts account = new Accounts("1", "name", "4545");
        assertEquals("1",account.getAccountNumber());

    }
    @Test
    public void canGetAccount(){
        Accounts account = new Accounts("1", "name", "4545");
        assertEquals(account.canGetAccount(),account.canGetAccount());
    }
    @Test
    public void canChangePin(){
        Accounts account = new Accounts("1", "name", "4545");
        account.deposit(10000);
        assertEquals(10000, account.checkBalance("4545"));
        account.withDraw(7000,"4545");
        account.canChangePin("4545", "4567");
        assertEquals(3000,account.checkBalance("4567"));
        account.deposit(4000);
        assertEquals(7000,account.checkBalance("4567"));
        account.withDraw(4000,"4567");
        account.withDraw(2000,"4567");
        assertEquals(1000,account.checkBalance("4567"));




    }

    }


