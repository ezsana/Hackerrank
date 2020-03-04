package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManasaAndStonesTest {

    @Test
    void differenceZero() {
        int stones = 2;
        int diff1 = 0;
        int diff2 = 1;
        int[] result = {0,1};
        Assertions.assertArrayEquals(result, ManasaAndStones.stones(stones, diff1, diff2));
    }

    @Test
    void sameDifference() {
        int stones = 5;
        int diff1 = 2;
        int diff2 = 2;
        int[] result = {8};
        Assertions.assertArrayEquals(result, ManasaAndStones.stones(stones, diff1, diff2));
    }
    @Test
    void distinctDifference1() {
        int stones = 3;
        int diff1 = 1;
        int diff2 = 2;
        int[] result = {2,3,4};
        Assertions.assertArrayEquals(result, ManasaAndStones.stones(stones, diff1, diff2));
    }

    @Test
    void distinctDifference2() {
        int stones = 5;
        int diff1 = 2;
        int diff2 = 7;
        int[] result = {8,13,18,23,28};
        Assertions.assertArrayEquals(result, ManasaAndStones.stones(stones, diff1, diff2));
    }

}