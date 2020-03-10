package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindDigitsTest {

    @Test
    void zeroAsParameter() {
        Assertions.assertEquals(0, FindDigits.findDigits(0));
    }

    @Test
    void zeroInNumber() {
        Assertions.assertEquals(1, FindDigits.findDigits(1000));
        Assertions.assertEquals(0, FindDigits.findDigits(2003));
        Assertions.assertEquals(2, FindDigits.findDigits(2500));
    }

    @Test
    void moreDigitsAreTheSame() {
        Assertions.assertEquals(2, FindDigits.findDigits(22));
        Assertions.assertEquals(3, FindDigits.findDigits(4335));
    }

    @Test
    void noSameDigits() {
        Assertions.assertEquals(2, FindDigits.findDigits(1234));
        Assertions.assertEquals(1, FindDigits.findDigits(136589));
        Assertions.assertEquals(3, FindDigits.findDigits(324516987));
    }

}