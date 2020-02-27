package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircularArrayRotationTest {

    @Test
    void emptyArray() {
        int[] arr = new int[0];
        int[] indices = {0};
        Assertions.assertNull(CircularArrayRotation.circularArrayRotation(arr, 3, indices));
    }

    @Test
    void oneElementArray() {
        int[] arr = {1};
        int[] indices = {0};
        Assertions.assertArrayEquals(arr, CircularArrayRotation.circularArrayRotation(arr, 3, indices));
    }

    @Test
    void twoElementsArray() {
        int[] arr = {1,2};
        int[] indices = {0,1};
        int[] result1 = {2,1};
        int[] result2 = {1,2};
        Assertions.assertArrayEquals(result1, CircularArrayRotation.circularArrayRotation(arr, 3, indices));
        Assertions.assertArrayEquals(result2, CircularArrayRotation.circularArrayRotation(arr, 4, indices));
    }

    @Test
    void threeElementsArray() {
        int[] arr = {1,2,3};
        int[] indices = {1,2};
        int[] result1 = {1,2};
        int[] result2 = {3,1};
        Assertions.assertArrayEquals(result1, CircularArrayRotation.circularArrayRotation(arr, 7, indices));
        Assertions.assertArrayEquals(result2, CircularArrayRotation.circularArrayRotation(arr, 5, indices));
    }


}