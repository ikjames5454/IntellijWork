import Strings.NumberToRoman;
import Strings.RomanNumeral;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    @Test
    public void testICanConvert(){
        String actual = RomanNumeral.romanFigure(54);
        String expected = "LIV";
        assertEquals(actual,expected);
        String actuals = RomanNumeral.romanFigure(1994);
        String expects = "MDMXCIV";
        assertEquals(actuals,expects);
    }
    @Test
    public void testICanConvert2(){
        int actual = NumberToRoman.roman("CCCXVI");
        int expected = 316;
        assertEquals(actual,expected);

    }
}
