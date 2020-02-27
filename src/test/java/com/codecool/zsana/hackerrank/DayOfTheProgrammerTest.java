package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfTheProgrammerTest {

    // Year should be between 1700 and 2700;
    // method return value is a String: dd.mm.yyyy;
    // parameter is an integer;

    @Test
    void yearIsUnder1700() {
        Assertions.assertEquals("Please specify year between 1700 and 2700.", DayOfTheProgrammer.dayOfProgrammer(1699));
        Assertions.assertEquals("Please specify year between 1700 and 2700.", DayOfTheProgrammer.dayOfProgrammer(-1));
    }

    @Test
    void yearIsAbove2700() {
        Assertions.assertEquals("Please specify year between 1700 and 2700.", DayOfTheProgrammer.dayOfProgrammer(2701));
    }

    @Test
    void yearIsLeapYearInJulianCalendar() {
        Assertions.assertEquals("12.09.1700", DayOfTheProgrammer.dayOfProgrammer(1700));
        Assertions.assertEquals("12.09.1808", DayOfTheProgrammer.dayOfProgrammer(1808));
    }

    @Test
    void yearIsLeapYearInGregorianCalendar() {
        Assertions.assertEquals("12.09.2000", DayOfTheProgrammer.dayOfProgrammer(2000));
        Assertions.assertEquals("12.09.2012", DayOfTheProgrammer.dayOfProgrammer(2012));
    }

    @Test
    void yearIsNormalInJulianCalendar() {
        Assertions.assertEquals("13.09.1701", DayOfTheProgrammer.dayOfProgrammer(1701));
        Assertions.assertEquals("13.09.1917", DayOfTheProgrammer.dayOfProgrammer(1917));
    }

    @Test
    void yearIsNormalInGregorianCalendar() {
        Assertions.assertEquals("13.09.1919", DayOfTheProgrammer.dayOfProgrammer(1919));
        Assertions.assertEquals("13.09.2699", DayOfTheProgrammer.dayOfProgrammer(2699));
        Assertions.assertEquals("13.09.2700", DayOfTheProgrammer.dayOfProgrammer(2700));
    }

    @Test
    void yearIs1918() {
        Assertions.assertEquals("26.09.1918", DayOfTheProgrammer.dayOfProgrammer(1918));
    }

}