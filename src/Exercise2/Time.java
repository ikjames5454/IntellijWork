package Exercise2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        boolean isInvalid = ( hour > 0 || hour >= 24);
        boolean isInvalid2 = ( minute > 0 || minute >= 60);
        boolean isInvalid3 = ( second > 0 || second >= 60);

        if (isInvalid || isInvalid2 || isInvalid3){
            throw new NullPointerException("invalid time");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

}
