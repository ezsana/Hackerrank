package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EqualizeTheArrayTest {

    @Test
    void emptyArray() {
        int[] arr = {};
        Assertions.assertEquals(0, EqualizeTheArray.equalizeArray(arr));
    }

    @Test
    void oneElementArray() {
        int[] arr = {1};
        Assertions.assertEquals(0, EqualizeTheArray.equalizeArray(arr));
    }

    @Test
    void onlyEqualNumbersInArray() {
        int[] arr = {2,2,2};
        Assertions.assertEquals(0, EqualizeTheArray.equalizeArray(arr));
    }

    @Test
    void noEqualNumbersInArray() {
        int[] arr = {2,3,4};
        Assertions.assertEquals(2, EqualizeTheArray.equalizeArray(arr));
    }

    @Test
    void equalAndNotEqualNumbersInArray() {
        int[] arr = {2,3,4,4,1};
        Assertions.assertEquals(3, EqualizeTheArray.equalizeArray(arr));
    }

    @Test
    void moreEqualNumbersInArray() {
        int[] arr = {1,2,2,4,4,3};
        Assertions.assertEquals(4, EqualizeTheArray.equalizeArray(arr));
    }
}