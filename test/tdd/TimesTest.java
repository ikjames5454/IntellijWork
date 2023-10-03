package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimesTest {


    @Test
    public void test_can_validateTime(){
        Times times = new Times();
        times.setTime(26,70,70);
        assertEquals(26,times.getHour());
        assertEquals(70,times.getMinute());
        assertEquals(70,times.getSecond());
//        assertEquals(45,times.getMinute());
//        assertEquals(34,times.getSecond());

    }
}
