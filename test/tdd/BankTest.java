package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {
    @Test
    public void bankCanRegisterCustomers(){
        Bank bank = new Bank("UBA");
        bank.canRegister("james", "ben", "pin");
        assertEquals(new Accounts("1", "james ben", "pin").canGetAccount(),bank.findAccountNumber("1").canGetAccount());
        bank.canRegister("michael","ejiofor","2234");
        assertEquals(new Accounts("2", "michael ejiofor", "2234").canGetAccount(),bank.findAccountNumber("2").canGetAccount());
        bank.canRegister("michael","akpan","223");
        assertEquals(new Accounts("3", "michael akpan", "223").canGetAccount(),bank.findAccountNumber("3").canGetAccount());


    }
    @Test
    public void testThatICanBeDepositIntoBank(){
        Bank bank = new Bank("UBA");
        bank.canRegister("james", "ben", "pin");
        assertEquals(new Accounts("1", "james ben", "pin").canGetAccount(),bank.findAccountNumber("1").canGetAccount());
        bank.canDeposit(7000,"1");
        assertEquals(7000,bank.checkBalance("1","pin"),0.0);
        bank.canDeposit(8000,"1");
        assertEquals(15000,bank.checkBalance("1","pin"),0.0);


    }
    @Test
    public void testThatICanBeWithdrawFromBank(){
        Bank bank = new Bank("UBA");
        bank.canRegister("james", "ben", "pin");
        assertEquals(new Accounts("1", "james ben", "pin").canGetAccount(),bank.findAccountNumber("1").canGetAccount());
        bank.canDeposit(5000,"1");
        bank.canDeposit(5000,"1");
        assertEquals(10000,bank.checkBalance("1","pin"),0.0);
        bank.canWithdraw(7000,"1","pin");
        assertEquals(3000,bank.checkBalance("1","pin"),0.0);
        bank.canWithdraw(2000,"1","pin");
        assertEquals(1000,bank.checkBalance("1","pin"),0.0);
        bank.canWithdraw(900,"1","pin");
        assertEquals(100,bank.checkBalance("1","pin"),0.0);

    }
    @Test
    public void testThatICanTransferFromOneAccountToAnother(){
        Bank bank = new Bank("UBA");
        bank.canRegister("james", "ben", "pin");
        bank.canRegister("michael","ejiofor","2234");
        assertEquals(new Accounts("1", "james ben", "pin").canGetAccount(),bank.findAccountNumber("1").canGetAccount());
        assertEquals(new Accounts("2", "michael ejiofor", "2234").canGetAccount(),bank.findAccountNumber("2").canGetAccount());
        bank.canDeposit(7000,"1");
        bank.canDeposit(10000,"1");
        assertEquals(17000,bank.checkBalance("1","pin"),0.0);
        bank.canTransfer(10000,"1","2","pin");
        assertEquals(7000,bank.checkBalance("1","pin"),0.0);
        assertEquals(10000,bank.checkBalance("2","2234"),0.0);
        bank.canRegister("toben","quincy","223");
        assertEquals(new Accounts("3", "toben quincy", "223").canGetAccount(),bank.findAccountNumber("3").canGetAccount());
        assertEquals(0,bank.checkBalance("3","223"),0.0);
        bank.canTransfer(5000,"1","3","pin");
        assertEquals(2000,bank.checkBalance("1","pin"),0.0);
        assertEquals(5000,bank.checkBalance("3","223"),0.0);





    }


}
