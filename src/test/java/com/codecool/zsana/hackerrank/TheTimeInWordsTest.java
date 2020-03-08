package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TheTimeInWordsTest {

    @Test
    void wholeHour() {
        int hour = 2;
        int min = 0;
        Assertions.assertEquals("two o' clock", TheTimeInWords.timeInWords(hour, min));
    }

    @Test
    void oneMinute() {
        int hour = 2;
        int min = 1;
        int min2 = 59;
        Assertions.assertEquals("one minute past two", TheTimeInWords.timeInWords(hour, min));
        Assertions.assertEquals("one minute to three", TheTimeInWords.timeInWords(hour, min2));
    }

    @Test
    void halfPast() {
        int hour = 3;
        int min = 30;
        Assertions.assertEquals("half past three", TheTimeInWords.timeInWords(hour, min));
    }

    @Test
    void quarterTo() {
        int hour = 2;
        int min = 45;
        Assertions.assertEquals("quarter to three", TheTimeInWords.timeInWords(hour, min));
    }

    @Test
    void quarterPast() {
        int hour = 6;
        int min = 15;
        Assertions.assertEquals("quarter past six", TheTimeInWords.timeInWords(hour, min));
    }

    @Test
    void minutesPast() {
        int hour = 8;
        int min = 21;
        Assertions.assertEquals("twenty one minutes past eight", TheTimeInWords.timeInWords(hour, min));
    }

    @Test
    void minutesTo() {
        int hour = 9;
        int min = 50;
        Assertions.assertEquals("ten minutes to ten", TheTimeInWords.timeInWords(hour, min));
    }

}