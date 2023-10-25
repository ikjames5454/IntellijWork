import Strings.RegexCondition;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegexConditionTest {
    @Test
    public void confirmation(){
        boolean isTrue = RegexCondition.followsPattern("abab");
        assertTrue(isTrue);
        boolean  isFalse = RegexCondition.followsPattern("abcdeabcd");
        assertFalse(isFalse);
    }
}
