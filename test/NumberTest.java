import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {
    @Test
    public void testThatICanDisplayNumber(){
        Number numb = new Number();
        String result = numb.displayNumber();
        String number = "1,2,3,4,5,6,7,8,9,10";
        assertEquals(result,number);
    }
}
