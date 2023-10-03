package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseToTest {

    @Test
    public void testThatItCanReverse(){
        ReverseTo reverse = new ReverseTo();
        int[] reverses = {6,2,3,4,1,0,5};
        String actual = reverse.reverseMethod(reverses,"kissdry");
        String expected = "yssdikr";
        assertEquals(actual,expected);
    }
}
