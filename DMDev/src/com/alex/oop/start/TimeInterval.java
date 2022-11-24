package com.alex.oop.start;

public class TimeInterval {

    private int second;
    private int hour;
    private int minutes;
    private final int secondPerMinute = 60;
    private final int secondPerHour = 3600;

    public TimeInterval(int totalSeconds) {
        this.hour = totalSeconds / secondPerHour;
        this.minutes = totalSeconds % secondPerHour / secondPerMinute;
        this.second = totalSeconds % secondPerHour % secondPerMinute;
    }

    public TimeInterval(int second, int minutes, int hour) {
        this.second = second;
        this.minutes = minutes;
        this.hour = hour;
    }

    public int totalSeconds() {
        return (hour * secondPerMinute * secondPerMinute) + (minutes * secondPerMinute) + second;
    }

    public void print() {
        System.out.println(second + " Second, " + minutes + " Minutes, " + hour + " Hour");
    }

    /**
     * Метод sum суммирует данный обьект с обьектом заданным в параметрах, и создает обьект с полями равными их сумме
     */
    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }
}
