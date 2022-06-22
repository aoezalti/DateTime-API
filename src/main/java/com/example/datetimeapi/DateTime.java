package com.example.datetimeapi;
import java.time.LocalDate;
import java.time.LocalTime;


public class DateTime {

    public LocalDate getDate () {
        return LocalDate.now();
    }
    public LocalTime getTime () {
        return LocalTime.now();
    }
}
