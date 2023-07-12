package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    @Test
    public void theBikeCanBeTurnOn(){
        Bike myBike = new Bike();
        myBike.setTurnOn(false);
        boolean theBikeCanBeTurnOn = myBike.getTurnOn();
        assertFalse(theBikeCanBeTurnOn);

        myBike.setTurnOn(true);
        boolean condition = myBike.getTurnOn();
        assertTrue(condition);

    }
    @Test
    public void theBikeCanBeTurnOff(){
        Bike myBike = new Bike();
        myBike.setTurnOn(true);
        boolean theBikeCanBeTurnOn = myBike.getTurnOn();;
        assertTrue(theBikeCanBeTurnOn);

        myBike.setTurnOn(false);
        assertFalse(myBike.getTurnOn());

    }
}
