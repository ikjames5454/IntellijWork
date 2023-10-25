import Strings.Subsequence;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubsequenceTest {

    @Test
    public void testThatIsTrue(){
        String subsequence = "ace";
        String sequence = "abCDE";
        boolean confirm = Subsequence.subsequence(subsequence,sequence);
        assertTrue(confirm);
    }
    @Test
    public void testThatIsFalse(){
        String subsequence = "stream";
        String sequence = "Mea";
        boolean confirm = Subsequence.subsequence(subsequence,sequence);
        assertFalse(confirm);
    }

}
