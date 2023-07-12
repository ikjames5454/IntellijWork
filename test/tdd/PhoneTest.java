package tdd;


import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {
    @Test
    public void thatIHaveAPhone(){
        Phone phone = new Phone();
        assertNotNull(phone);
    }
    @Test
    public void thatMyPhoneCanOffAndOn(){
        Phone phone = new Phone();
        phone.power();
        assertTrue(phone.getIsOn());

        phone.power();
        assertFalse(phone.getIsOn());




    }
    @Test
    public void thatMyPhoneHasMainMenu(){
        Phone phone = new Phone();
        phone.power();
        phone.setMainMenu("phoneBook","messages","chat");
        assertNotNull(phone.getMainMenu());



    }


}
