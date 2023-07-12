package tdd;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class HeartRatesTest {
    @Test
    public void testThatHeartRatesExist() {
        HeartRates heartRates = new HeartRates();
        assertNotNull(heartRates);
    }

    @Test
    public void testThatHeartRatesHasFirstName() {
        HeartRates heartRates = new HeartRates();
        heartRates.setFirstName("Esther");
        assertNotNull(heartRates.getFirstName());

    }

    @Test
    public void testThatHeartRatesHasLastName() {
        HeartRates heartRates = new HeartRates();
        heartRates.setLastName("joan");
        assertNotNull(heartRates.getLastName());
    }

}
