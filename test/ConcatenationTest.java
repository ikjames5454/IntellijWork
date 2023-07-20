import ChibuzorAssignment.Concatenation;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConcatenationTest {

    @Test
    public void testThatTwoListCanBeConcatenated(){
        char[] character = {'a', 'b', 'c'};
        int[] numbers = {1, 2, 3};
        String[] answer = {"a", "b", "c", "1", "2", "3"};

        String[] newList = Concatenation.addTwoList(character, numbers);
        assertArrayEquals(answer, newList);
    }
}
