package tdd;

public class Clock {
    private int second;
    private int minute;
    private int hour;

    public void setSecond(int second) {
        if ((hour > 0 && minute > 0 && second > 0)){
            if (second <= 60) this.second = second;
        }
             if (second >= 60 && hour <= 60) {
                 this.hour = second / 3600;
                 this.minute = second / 60;
                 this.second = second % 60;
                 this.hour = hour%12;




        }
    }

    public int getSecond() {
        return second;

            
        }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(hour > 0 && minute > 0 && second > 0) {
            if (minute <= 60) this.minute = minute;
        }
        if (second <= 60 && minute >= 60){
            this.second = minute * 60;
            this.hour = minute / 60;
            this.minute = minute%60;


    }
        
        
    }
}
