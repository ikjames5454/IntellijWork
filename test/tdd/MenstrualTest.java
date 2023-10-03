package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenstrualTest {

    Menstrual menstrual = new Menstrual();

    @Test
    public void TestThatMenstrualApp_CanPredictNextPeriodDate(){
        String lastPeriod = String.valueOf(menstrual.checkNextFlowDate("2023-09-25", 28));
        String nextPeriod = "2023-10-24";
        Assertions.assertEquals(nextPeriod, lastPeriod);
        String lastMenstrualPeriod = String.valueOf((menstrual.checkNextFlowDate("2023-10-23",28)));
        String nextMenstrualPeriod = "2023-11-21";
        Assertions.assertEquals(lastMenstrualPeriod,nextMenstrualPeriod);


    }
    @Test
    public void TestThatMenstrualApp_CheckEndOfCircle(){
        String lastPeriod = String.valueOf(menstrual.checkEndOfMenstrualCircle("2023-09-25", 28));
        String nextPeriod = "2023-10-23";
        Assertions.assertEquals(nextPeriod, lastPeriod);
        String lastMenstrualPeriod = String.valueOf((menstrual.checkEndOfMenstrualCircle("2023-10-23",28)));
        String nextMenstrualPeriod = "2023-11-20";
        Assertions.assertEquals(lastMenstrualPeriod,nextMenstrualPeriod);


    }

    @Test
    public void TestThatMenstrualApp_CanPredictTheNextOvulationDate(){
        String lastPeriod = String.valueOf(menstrual.ovulationDate("2023-09-20", 28));
        String nextOvulationDate = "2023-10-04";
        Assertions.assertEquals(nextOvulationDate, lastPeriod);
        String lastMenstrualPeriod = String.valueOf(menstrual.ovulationDate("2023-10-14", 28));
        String theNextOvulationDate = "2023-10-28";
        Assertions.assertEquals(theNextOvulationDate, lastMenstrualPeriod);
    }

    @Test
    public void testThatMenstrualApp_CanPredictTheNextSafeDate(){
        String currentPeriod = String.valueOf(menstrual.nextSafeDate("2023-09-20", 28));
        String beginningOfNextSaveDate = "2023-10-11";
        Assertions.assertEquals(beginningOfNextSaveDate , currentPeriod);
    }


}

