package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest{
    @Test
    public void calculatorCanBeCreated(){
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
   }
   @Test
    public void calculatorCanBePoweredOn(){
       Calculator calculator = new Calculator();
       calculator.power();
       assertTrue(calculator.getIsOn());
   }
   @Test
   public void calculatorCanBePoweredOff() {
       Calculator calculator = new Calculator();
       calculator.power();
       assertTrue(calculator.getIsOn());

       calculator.power();
       assertFalse(calculator.getIsOn());
   }




}
