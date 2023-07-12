package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinancialTest {
    @Test
    public void testThatICanConvertDollarToRMD(){
        Financial exchange = new Financial();
         exchange.convertDollar(100);
         double convert =  exchange.getRmb();
         assertEquals(681.0,convert);
    }
    @Test
    public void testThatICanConvertRMDToDollar(){
        Financial exchange = new Financial();
        exchange.convertRMD(10000);
        double convert = exchange.getDollar();
        assertEquals(1468.0,convert);

    }
}
