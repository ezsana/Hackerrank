package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BigSortingTest {

 /*
     Acceptance criteria is not clear:
      - Output Format: Print each element of the sorted array on a new line.
        OR!!!
      - Complete the bigSorting function in the editor. It should return the sorted string array.
      => Should it be the return value AND printed out as well???
      => Should be the returned String[] looking like this: {"1\n", "2\n"...etc} ???
      Conclusion:
      Manual test + automated tests: print is checked manually, return String[] checked with aut tests.
 */

    @Test
    void testWithNegativeNumbers() {
        String[] s = {"-2", "1", "1"};
        Assertions.assertNull(BigSorting.bigSorting(s));
    }

    @Test
    void testWithZero() {
        String[] s = {"0", "2"};
        Assertions.assertNull(BigSorting.bigSorting(s));
    }

    @Test
    void testWithNonIntegerNumber() {
        String[] s = {"2.4", "3"};
        Assertions.assertNull(BigSorting.bigSorting(s));
    }

    @Test
    void testWithNonNumbers() {
        String[] s = {"3", "ff"};
        Assertions.assertNull(BigSorting.bigSorting(s));
    }

    @Test
    void testWithEmptyArray() {
        String[] s = {};
        Assertions.assertArrayEquals(s, BigSorting.bigSorting(s));
    }

    @Test
    void testWithOneNumberInArray() {
        String[] s = {"6"};
        Assertions.assertArrayEquals(s, BigSorting.bigSorting(s));
        /*  Manual:
         *      - check if printed out: 6
         */
    }

    @Test // Happy path
    void testWithPositiveIntegers() {
        String[] s = {"1000", "342", "12", "1", "8", "367812", "10000001"};
        String[] sortedS = {"1", "8", "12", "342", "1000", "367812", "10000001"};
        Assertions.assertArrayEquals(sortedS, BigSorting.bigSorting(s));
        /*  Manual:
         *      - check if printed out:
         *          1
         *          8
         *          12
         *          342
         *          1000
         *          367812
         *          10000001
         */
    }

    @Test
    void hackerTest1() {
        String[] s = {"8", "1", "2", "100", "12303479849857341718340192371", "3084193741082937", "3084193741082938", "111", "200"};
        String[] sortedS = {"1", "2", "8", "100", "111", "200", "3084193741082937", "3084193741082938", "12303479849857341718340192371"};
        Assertions.assertArrayEquals(sortedS, BigSorting.bigSorting(s));
    }

}