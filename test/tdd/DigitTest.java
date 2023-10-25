package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitTest {

    @Test
    public void addDigit(){
        Digit number = new Digit();
        int expected = number.addDigits(3456);
        int actual = 9;
        assertEquals(expected,actual);
    }
}
