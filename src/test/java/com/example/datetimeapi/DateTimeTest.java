package com.example.datetimeapi;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeTest {

    @Test
    void getDate() {
    DateTime dateTime = new DateTime();
        assertEquals(LocalDate.now(),dateTime.getDate());
    }

    void getTime() {
        DateTime dateTime = new DateTime();
        assertEquals(LocalTime.now(),dateTime.getTime());
    }

}