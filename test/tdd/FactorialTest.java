package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void testThatMyCalculatorCanFactorize(){
        Factorial factorial = new Factorial();
        int factorialize = factorial.convertToFactorial(-5);
        assertEquals(1,factorialize);

    }
    @Test
    public void testThatMyCalculatorCanFactorize_1(){
        Factorial factorial = new Factorial();
        int factorialise = factorial.convertToFactorial(13);
        assertEquals(1,factorialise);
    }
    @Test
    public void testThatMyCalculatorCanPerformExponential(){
        Factorial factorial = new Factorial();
        double exponential = factorial.convertToExponential(5);
        assertEquals(91.42,exponential);
    }
    @Test
    public void testThatMyCalculatorCanPerformAnyExponential(){
        Factorial factorial = new Factorial();
        double exponential = factorial.convertToExponential(3);
        assertEquals(13,exponential);

    }
}
