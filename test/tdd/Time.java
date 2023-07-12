package tdd;

public class Time {
    private int minute;
    private int hour;
    private int year;
    private int day;

    public void setMinute(int minute) {
        if (minute > 0) {

            this.minute = minute * 60;


        }


    }

    public int getMinute() {
        return minute;
    }


    public int getYear() {
        return year;
}

    public void minuteConversion(int minute) {
        if (minute > 0) {
            year = minute / 525600;
            hour = minute / 60;
            day = minute / 1440;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getDay() {
        return day;
    }
}


