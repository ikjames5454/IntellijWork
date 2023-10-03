package tdd;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Menstrual {

        public LocalDate checkNextFlowDate(String lastPeriod, int cycleDuration) {
            String specifiedDate = parseDate(lastPeriod);
            LocalDate specificDate = LocalDate.parse(specifiedDate);
            return specificDate.plusDays(cycleDuration + 1);
        }
    public LocalDate checkEndOfMenstrualCircle(String lastPeriod, int cycleDuration) {
        String specifiedDate = parseDate(lastPeriod);
        LocalDate specificDate = LocalDate.parse(specifiedDate);
        return specificDate.plusDays(cycleDuration );
    }

        public LocalDate ovulationDate(String lastPeriod, int menstrualCycleDuration) {
            String specifiedDate = parseDate(lastPeriod);
            LocalDate specificDate = LocalDate.parse(specifiedDate);
            return specificDate.plusDays(menstrualCycleDuration / 2);
        }

        public LocalDate nextSafeDate(String lastPeriod, int menstrualCycleDuration) {
            String specifiedDate = parseDate(lastPeriod);
            LocalDate specificDate = LocalDate.parse(specifiedDate);
            return specificDate.plusDays(menstrualCycleDuration - 7);
        }

        private static String parseDate(String date) {
            try {
                SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
                dateFormat1.parse(date);

                return date;
            } catch (ParseException error) {
                throw new IllegalArgumentException("----------Invalid Date Format");
            }
        }
    }

