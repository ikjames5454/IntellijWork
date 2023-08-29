package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountsTest {
    @Test
    public void depositBalanceIncreasesTest(){
        Accounts account = new Accounts("1", "name", "4545");
        assertEquals(0,account.checkBalance("4545"));
        account.deposit(5000);
        assertEquals(5000,account.checkBalance("4545"));
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
        account.withDraw(-7000);
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
        assertEquals("1",account.canGetAccount());

    }

    }


