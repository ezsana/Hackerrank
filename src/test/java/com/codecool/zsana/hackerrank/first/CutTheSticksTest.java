package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CutTheSticksTest {

    @Test
    void emptyArray() {
        int[] arr = {};
        Assertions.assertArrayEquals(arr, CutTheSticks.cutTheSticks(arr));
    }

    @Test
    void oneElementArray() {
        int[] arr = {5};
        int[] cuts = {1};
        Assertions.assertArrayEquals(cuts, CutTheSticks.cutTheSticks(arr));
    }

    @Test
    void twoElementArray() {
        int[] arr = {1,2};
        int[] cuts = {2,1};
        Assertions.assertArrayEquals(cuts, CutTheSticks.cutTheSticks(arr));
    }

    @Test
    void moreElementArray1() {
        int[] arr = {1,2,3};
        int[] cuts = {3,2,1};
        Assertions.assertArrayEquals(cuts, CutTheSticks.cutTheSticks(arr));
    }

    @Test
    void moreElemenArray2() {
        int[] arr = {5,4,4,2,2,8};
        int[] cuts = {6,4,2,1};
        Assertions.assertArrayEquals(cuts, CutTheSticks.cutTheSticks(arr));
    }

    @Test
    void moreThanOneLastElement() {
        int[] arr = {5,6,6,3};
        int[] cuts = {4,3,2};
        Assertions.assertArrayEquals(cuts, CutTheSticks.cutTheSticks(arr));
    }

}