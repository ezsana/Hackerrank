package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaumAndBdayTest {

    @Test
    void zIsZero() {
        Assertions.assertEquals(48, TaumAndBday.taumBday(11,5,3,9,0));
    }

    @Test
    void bcIsBiggerThanWcPlusZ() {
        Assertions.assertEquals(43, TaumAndBday.taumBday(5,6,10,3,2));
    }

    @Test
    void wcIsBiggerThanBcPlusZ() {
        Assertions.assertEquals(78, TaumAndBday.taumBday(4,10,2,11,5));
    }

    @Test
    void bcEqualsToWcPlusZ() {
        Assertions.assertEquals(63, TaumAndBday.taumBday(6,7,7,3,4));
    }

    @Test
    void neitherOfBcOrWcPlusOneIsBigger() {
        Assertions.assertEquals(86, TaumAndBday.taumBday(9,10,4,5,2));
    }

    @Test
    void hackerTest() {
        Assertions.assertEquals(18192035842L, TaumAndBday.taumBday(27984, 1402, 619246, 615589, 247954));
    }

}