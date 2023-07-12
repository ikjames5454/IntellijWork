package tdd;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CarTest {
    @Test
    public void testThatICanCreateACar(){
        Car car = new Car();
        assertNotNull(car);

    }
    @Test
    public void testThatTheCarCanBePoweredOn(){
        Car car = new Car();
        car.Start();
        assertTrue(car.isEngineRunning());

    }
    @Test
    public void testThatTheCarCanAccelerate() {
        Car car = new Car();
        car.Start();
        assertTrue(car.isEngineRunning());


    }

    }
