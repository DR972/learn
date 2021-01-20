package by.epam.learn.main.modul3.simpleClasess;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int checkMinute(int checkMinute) {
        if (checkMinute > 59 || checkMinute < 0) checkMinute = 0;
        return (checkMinute);
    }

    public int checkHour(int checkHour) {
        if (checkHour > 23 || checkHour < 0) checkHour = 0;
        return (checkHour);
    }

    public String changeTime(int changeHour, int changeMinute, int changeSecond) {
        second = checkMinute(changeSecond) + checkMinute(second);
        minute = checkMinute(changeMinute) + checkMinute(minute);
        hour = checkHour(hour) + checkHour(changeHour);
        if (second > 59) {
            second = second - 60;
            minute++;
        }
        if (minute > 59) {
            minute = minute - 60;
            hour++;
        }
        return String.format("%02d:%02d:%02d%n", hour, minute, second);
    }
}