package QAP1charles.Problem3;

public class Time {
    private int hour;
    private int minute;
    private int second;


    //constructor
    public Time(int hour, int minute, int second) {
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
    public void SetHour(int hour) {
        this.hour = hour;
    }
    public void SetMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond(){
        second++;
        return this;
    }
    public Time previousSecond(){
        second--;
        return this;
    }
}
