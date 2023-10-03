package tdd;


import org.opentest4j.AssertionFailedError;

public class Times {
        private int hour;
        private int minute;
        private int second;

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        public void setTime(int hour, int minute, int second) {
            setReference(hour, minute, second);
            setAttribute(hour, minute, second);


        }
        public void setReference(int hour, int minute, int second){
            validateHour(hour);
            validateMinute(minute);
            validateSecond(second);
            }
        public void setAttribute(int hour, int minute, int second){
            setHour(hour);
            setMinute(minute);
            setSecond(second);
        }
        public void setHour(int hour){
            this.hour = hour;
        }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
        public void validateHour(int hour) {
            try {
                boolean isInvalid = (hour < 0 || hour >= 24);
                if (isInvalid) throw new NullPointerException("invalid hour");
            }catch (NullPointerException | AssertionFailedError e){
                System.out.println(e);
            }
        }
        public void validateMinute(int minute){
        try {
            boolean isInvalid2 = (minute < 0 || minute >= 60);
            if (isInvalid2) throw new NullPointerException("invalid minute");
        }catch (NullPointerException | AssertionFailedError e){
            System.out.println(e);
        }
        }
        public void validateSecond(int second) {
            try {
                boolean isInvalid3 = (second < 0 || second >= 60);
                if (isInvalid3) throw new NullPointerException("invalid second");
            } catch (NullPointerException | AssertionFailedError e) {
                System.out.println(e);
            }
        }



    }


