package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClockTest {
    @Test
    public void testThatMyClockExist(){
        Clock clock = new Clock();
        assertNotNull(clock);
    }
    @Test
   public void  testThatMySecondReturnsSecond(){
        Clock clock = new Clock();
        clock.setSecond(60);
        assertEquals(0,clock.getHour());
        assertEquals(1,clock.getMinute());
        assertEquals(0,clock.getSecond());







    }
    @Test
public void testThatMinuteReturns(){
        Clock clock = new Clock();
        clock.setMinute(3601);
        assertEquals(60,clock.getHour());
        assertEquals(1,clock.getMinute());
        assertEquals(216060,clock.getSecond());


}

}
