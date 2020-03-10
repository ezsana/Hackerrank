package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StrangeCounterTest {

    @Test
    void test1() {
        Assertions.assertEquals(1, StrangeCounter.strangeCounter(3));
    }

    @Test
    void test2() {
        Assertions.assertEquals(5, StrangeCounter.strangeCounter(5));
    }

    @Test
    void test3() {
        Assertions.assertEquals(3, StrangeCounter.strangeCounter(7));
    }

    @Test
    void test4() {
        Assertions.assertEquals(7, StrangeCounter.strangeCounter(15));
    }

    @Test
    void test5() {
        Assertions.assertEquals(9, StrangeCounter.strangeCounter(13));
    }

    @Test
    void test6() {
        Assertions.assertEquals(24, StrangeCounter.strangeCounter(22));
    }

    @Test
    void test7() {
        Assertions.assertEquals(18, StrangeCounter.strangeCounter(28));
    }

}