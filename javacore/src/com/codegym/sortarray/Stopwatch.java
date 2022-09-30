package com.codegym.sortarray;

import java.time.LocalTime;

public class Stopwatch {
    private LocalTime startTime, endTime;

    public Stopwatch() {
        startTime = LocalTime.now();
    }

    public Stopwatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String start() {
        startTime = LocalTime.now();
        return startTime.toString();
    }

    public String end() {
        endTime = LocalTime.now();
        return endTime.toString();
    }

    public int getElapsedTime() {
        int milisecond = -(((startTime.getHour() - endTime.getHour()) * 3600 + (startTime.getMinute() - endTime.getMinute()) * 60 + (startTime.getSecond() - endTime.getSecond())) * 1000);
        return milisecond;
    }
}
