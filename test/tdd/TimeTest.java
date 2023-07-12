package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    @Test
    public void testThatMinuteCanConvertToSecond(){
        Time time = new Time();
        time.setMinute(600);
        int second = time.getMinute();
        assertEquals(36000,second);






    }
    @Test
    public void testThatMinuteCanConvertToYear(){
        Time time = new Time();
        time.minuteConversion(1000000000);

        int year = time.getYear();
        assertEquals(1902,year);
    }
    @Test
    public void testThatMinuteCanConvertToHour(){
        Time time = new Time();
        time.minuteConversion(60);
        int hour = time.getHour();
        assertEquals(1,hour);

    }
    @Test
    public void testThatMinuteCanConvertToDay(){
        Time time = new Time();
        time.minuteConversion(1440 * 2);
        int day = time.getDay();
        assertEquals(2,day);
    }

    }


