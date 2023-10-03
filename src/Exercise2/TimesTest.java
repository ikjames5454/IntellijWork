package Exercise2;

public class TimesTest {
    public static void main(String[] args) {
        Times times = new Times(23,45,29);
        System.out.printf("The time is: %d:%d:%d",times.getHour(),times.getMinute(),times.getSecond());

    }
}

class Times{
    private int hour;
    private int minute;
    private int second;

    public Times(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

//    public void setHour(int hour) {
//        this.hour = hour;
//    }
//
//    public void setMinute(int minute) {
//        this.minute = minute;
//    }
//
//    public void setSecond(int second) {
//        this.second = second;
//    }

}
