package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

    @Test
    void noon() {
        String time = "12:00:00PM";
        Assertions.assertEquals("12:00:00", TimeConversion.timeConversion(time));
    }

    @Test
    void midnight() {
        String time = "12:00:00AM";
        Assertions.assertEquals("00:00:00", TimeConversion.timeConversion(time));
    }

    @Test
    void morning() {
        String time = "05:17:10AM";
        Assertions.assertEquals("05:17:10", TimeConversion.timeConversion(time));
    }

    @Test
    void afternoon() {
        String time = "05:12:13PM";
        Assertions.assertEquals("17:12:13", TimeConversion.timeConversion(time));
    }

    @Test
    void evening() {
        String time = "10:01:02PM";
        Assertions.assertEquals("22:01:02", TimeConversion.timeConversion(time));
    }

}