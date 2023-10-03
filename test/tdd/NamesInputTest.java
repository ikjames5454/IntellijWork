package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamesInputTest {
    @Test
    public void testICanCollectInitials() {
        NamesInput names = new NamesInput();
        String actual = names.collectName("alagbu ikenna james");
        String expected = "A. I. james";
        assertEquals(actual, expected);
    }
    @Test
    public void testCanAddDigit(){
        NamesInput names = new NamesInput();
        int actual = Integer.parseInt(String.valueOf(names.canAdd("1234refds3456")));
        int expected = 28;
        assertEquals(actual,expected);
    }
}
