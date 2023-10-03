package tdd;

import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class PeopleInfoCaptureTest {

    private PeopleInfoCapture information;


    @Test
    public void testConfirmItCanLock() {
        information = new PeopleInfoCapture("bisi", "password");
        information.lockEntry();
        assertTrue(information.isLockEntry());

    }
    @Test
    public void testConfirmItCanUnlock() {
        information = new PeopleInfoCapture("bisi","password");
        information.lockEntry();
        information.unLockEntry("password");
        assertFalse(information.isLockEntry());
}
    @Test
    public void testICanCreateEntry(){
        information = new PeopleInfoCapture("bisi","password");
        assertFalse(information.isLockEntry());
        information.createEntry("Adeola sara","No 47 oguntade street, off redeem bus/stop","09159623481","Adeolasara@gmail.com");
        assertEquals("No 47 oguntade street, off redeem bus/stop",information.findEntry("Adeola sara").getAddress());
        assertEquals("09159623481",information.findEntry("Adeola sara").getTelephone());
        assertEquals("Adeolasara@gmail.com",information.findEntry("Adeola sara").getEmail());
        assertEquals("Adeola sara No 47 oguntade street, off redeem bus/stop 09159623481 Adeolasara@gmail.com",information.findEntry("Adeola sara").getInfo());

    }
    @Test
    public void testICanDeleteEntry(){
        information = new PeopleInfoCapture("bisi","password");
        assertFalse(information.isLockEntry());
        information.createEntry("Adeola sara","No 47 oguntade street, off redeem bus/stop","09159623481","Adeolasara@gmail.com");
        information.deleteEntry("Adeola sara");
        assertThrows(NullPointerException.class, ()->information.findEntry("Adeola sara"));
    }
    @Test
    public void testICanUpdateEntry(){
        information = new PeopleInfoCapture("bisi","password");
        assertFalse(information.isLockEntry());
        information.createEntry("Adeola sara","No 47 oguntade street, off redeem bus/stop","09159623481","Adeolasara@gmail.com");
        information.updateEntry("Adeola sara","No 47 bamidele street, off ashabi taiwo bus/stop","09159623482","Adeolasara@gmail.com");
        assertEquals(new CustomerInfo("Adeola sara","No 47 bamidele street, off ashabi taiwo bus/stop","09159623482","Adeolasara@gmail.com"),information.findEntry("Adeola sara"));
    }

}
