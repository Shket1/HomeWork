package com.alex.oop.start;

public class TimeIntervalRunner{
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds() + 2000);
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        TimeInterval sumIntervals = timeInterval.sum(timeInterval2);
        sumIntervals.print();
        System.out.println(sumIntervals.totalSeconds());
    }
}