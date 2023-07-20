import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    public void testThatICanMultiplyWithOutAsterisks() {
        Multiplication multiplication = new Multiplication();
        int multiply = multiplication.iCanMultiply(2, 10);
        assertEquals(20, multiply);
    }

    @Test
    public void testThatICanSquareNumber() {
        Multiplication multiplication = new Multiplication();
        int square = multiplication.iCanSquare(10, 2);
        assertEquals(100, square);

    }
    @Test
    public void testThatICanReverseNumber() {
        Multiplication multiplication = new Multiplication();
        int array = multiplication.reverseArray(2347689);
        assertEquals(9867432,array);
    }
    @Test
    public void testThatICanRemoveNumber() {
        Multiplication multiplication = new Multiplication();
        int numbers = multiplication.element(67948234);

    }

}

