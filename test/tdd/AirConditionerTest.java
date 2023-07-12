package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirConditionerTest {
    @Test
    public void myAirConditionerCanBeIsOn(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(false);
        boolean myAirConditionerCanBeTurnOn = myAir.getIsOn();
        assertFalse(myAirConditionerCanBeTurnOn);

        myAir.setIsOn(true);
        boolean condition = myAir.getIsOn();
                assertTrue(condition);


    }
    @Test
    public void myAirConditionerCanBeIsOff(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        boolean myAirConditionerCanBeTurnOn = myAir.getIsOn();
        assertTrue(myAirConditionerCanBeTurnOn);

        myAir.setIsOn(false);
        boolean condition = myAir.getIsOn();
        assertFalse(condition);


    }
    @Test
    public void myAirConditionerCanIncreaseTemperature(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        myAir.setTemperature(17);
        assertEquals(17, myAir.getTemperature());

        myAir.increaseTemperature();
        int newTemperature = myAir.getTemperature();
        assertEquals(18, newTemperature);


    }
    @Test
    public void myAirConditionerCanIncrease(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        myAir.setTemperature(23);
        assertEquals(23,myAir.getTemperature());

        myAir.increaseTemperature();
        int newTemperature = myAir.getTemperature();
        assertEquals(24,newTemperature);


    }
    @Test
    public void myAirConditionerCanIncreaseToThirty(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        myAir.setTemperature(30);
        assertEquals(30,myAir.getTemperature());

        myAir.increaseTemperature();
        int newTemperature = myAir.getTemperature();
        assertEquals(30,newTemperature);
    }
    @Test
    public void myAirConditionCanDecreaseToSixteen(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        myAir.setTemperature(16);
        assertEquals(16,myAir.getTemperature());

        myAir.decreaseTemperature();
        int newTemperature = myAir.getTemperature();
        assertEquals(16,newTemperature);


    }
    @Test
    public void myAirConditionerCanDecrease(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        myAir.setTemperature(24);
        assertEquals(24,myAir.getTemperature());

        myAir.decreaseTemperature();
        int newTemperature = myAir.getTemperature();
        assertEquals(23,newTemperature);

    }
    @Test
    public void myAirConditionerCanIncreaseMultipleTimes(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        myAir.setTemperature(23);
        assertEquals(23,myAir.getTemperature());

        myAir.increaseTemperature();
        myAir.increaseTemperature();
        myAir.increaseTemperature();
        int newTemperature = myAir.getTemperature();
        assertEquals(26,newTemperature);



    }
    @Test
    public void myAirConditionerCanDecreaseAndIncreaseMultipleTimes() {
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        myAir.setTemperature(23);
        assertEquals(23, myAir.getTemperature());

        myAir.decreaseTemperature();
        myAir.increaseTemperature();
        myAir.increaseTemperature();
        myAir.increaseTemperature();
        myAir.increaseTemperature();
        myAir.increaseTemperature();
        int newTemperature = myAir.getTemperature();
        assertEquals(27,newTemperature);




    }
    @Test
    public void myAirConditionerCanIncreaseTemperatureWhenOff() {
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(false);
        myAir.setTemperature(26);
        boolean myAirConditionerCanIncreaseTemperatureWhenOff = myAir.getIsOn();
        assertFalse(myAirConditionerCanIncreaseTemperatureWhenOff);

    }
    @Test
    public void myAirConditionerCanAcceptNegativeValueWhenIsOn(){
        AirConditioner myAir = new AirConditioner();
        myAir.setIsOn(true);
        myAir.setTemperature(17);
        assertEquals(17,myAir.getTemperature());

        myAir.inputNegativeTemperature();
         int newTemperature = myAir.getTemperature();
         assertEquals(17,newTemperature);



    }



    }






